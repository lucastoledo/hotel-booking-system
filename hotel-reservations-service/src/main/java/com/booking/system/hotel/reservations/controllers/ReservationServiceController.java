package com.booking.system.hotel.reservations.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.system.hotel.reservations.model.Reservation;

@RestController
@RequestMapping(value="v1/hotels/{hotelId}/reservations")
public class ReservationServiceController {

	@RequestMapping(value="/{roomId}",method = RequestMethod.GET)
	public List<Reservation> getReservationsForRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId){
		List<Reservation> reservations = new ArrayList<>();
		reservations.add(getDummyReservation());
		return reservations;
	}
	
	private Reservation getDummyReservation() {
		LocalDateTime checkIn = LocalDateTime.now();
		return new Reservation().withId("1").withRoomId("roomId-01").withGuestId("guestID-02").withStartDate(checkIn).withEndDate(checkIn.plusDays(2));
	}
}