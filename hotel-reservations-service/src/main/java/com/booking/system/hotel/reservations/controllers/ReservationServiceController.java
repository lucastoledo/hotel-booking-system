package com.booking.system.hotel.reservations.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.system.hotel.reservations.model.Reservation;
import com.booking.system.hotel.reservations.services.ReservationService;

@RestController
@RequestMapping(value="v1/hotels/{hotelId}/reservations")
public class ReservationServiceController {
	
    @Autowired
    private ReservationService reservationService;

	@RequestMapping(value="/{roomId}",method = RequestMethod.GET)
	public List<Reservation> getReservationsForRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId){
		List<Reservation> reservations = new ArrayList<>();
		reservations.add(reservationService.getReservation(hotelId, roomId));
		return reservations;
	}
	
	
}