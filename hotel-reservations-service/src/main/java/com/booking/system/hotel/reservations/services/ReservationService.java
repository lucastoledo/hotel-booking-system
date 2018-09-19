package com.booking.system.hotel.reservations.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.system.hotel.reservations.clients.RoomsFeignClient;
import com.booking.system.hotel.reservations.model.Reservation;
import com.booking.system.hotel.reservations.model.Room;
import com.booking.system.hotel.reservations.repository.ReservationRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class ReservationService {
//	private static final Logger logger = LoggerFactory.getLogger(ReservationService.class);

	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private RoomsFeignClient roomsFeignClient;

	@HystrixCommand(fallbackMethod = "buildFallbackReservationList",
			// bulkhead properties
			threadPoolKey = "reservationsByHotelIdAndRoomIdThreadPool", threadPoolProperties = {
					@HystrixProperty(name = "coreSize", value = "30"),
					@HystrixProperty(name = "maxQueueSize", value = "10") })
	public List<Reservation> getReservationsByHotelIdAndRoomId(String hotelId, String roomId) {

//		randomlyRunLong();
		Room room = roomsFeignClient.getRoom(hotelId, roomId);
		return reservationRepository.findByRoomId(roomId).stream().map(r -> r.withRoom(room)) // add room to reservation
				.collect(Collectors.toList());
	}

	@SuppressWarnings("unused")
	private List<Reservation> buildFallbackReservationList(String hotelId, String roomId) {
		List<Reservation> fallbackList = new ArrayList<>();
		Reservation reservation = new Reservation().withReservationId("00000").withRoomId(roomId)
				.withComment("Sorry no Reservation information currently available");
		fallbackList.add(reservation);
		return fallbackList;
	}

	private void randomlyRunLong() {
		Random rand = new Random();

		int randomNum = rand.nextInt((3 - 1) + 1) + 1;

		if (randomNum == 3)
			sleep();
	}

	private void sleep() {
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
