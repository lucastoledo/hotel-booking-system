package com.booking.system.hotel.reservations.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.system.hotel.reservations.config.ReservationsConfig;
import com.booking.system.hotel.reservations.model.Reservation;

@Service
public class ReservationService {

	@Autowired
	ReservationsConfig config;
	
	public Reservation getReservation(String hotelId, String roomId) {
		
			LocalDateTime checkIn = LocalDateTime.now();
		System.out.println("LUCAS: config.getExampleProperty(): " + config.getExampleProperty());
		return new Reservation().withId("1").withRoomId("roomId-01").withGuestId("guestID-02").withStartDate(checkIn).withEndDate(checkIn.plusDays(2)).withComment(config.getExampleProperty()).withEncodedComment(config.getExampleEncoded());
		
	}
}
