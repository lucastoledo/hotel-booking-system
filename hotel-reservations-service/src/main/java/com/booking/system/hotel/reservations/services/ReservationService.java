package com.booking.system.hotel.reservations.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.system.hotel.reservations.clients.RoomsFeignClient;
import com.booking.system.hotel.reservations.model.Reservation;
import com.booking.system.hotel.reservations.model.Room;
import com.booking.system.hotel.reservations.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private RoomsFeignClient roomsFeignClient;

	public List<Reservation> getReservationsByHotelIdAndRoomId(String hotelId, String roomId) {

		Room room = roomsFeignClient.getRoom(hotelId, roomId);
		return reservationRepository.findByRoomId(roomId)
				.stream()
				.map(r -> r.withRoom(room)) //add room to reservation
				.collect(Collectors.toList());
	}
}
