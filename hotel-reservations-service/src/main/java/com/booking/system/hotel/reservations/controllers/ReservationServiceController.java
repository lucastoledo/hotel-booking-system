package com.booking.system.hotel.reservations.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.system.hotel.reservations.model.Reservation;
import com.booking.system.hotel.reservations.services.ReservationService;

@RestController
@RequestMapping(value = "v1/hotels/{hotelId}/reservations")
public class ReservationServiceController {

	private static final Logger logger = LoggerFactory.getLogger(ReservationServiceController.class);

	@Autowired
	private ReservationService reservationService;

	@RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
	public List<Reservation> getReservationsForRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId) {
		logger.debug("Entering the hotel-reservations-service  ");
		return reservationService.getReservationsByHotelIdAndRoomId(hotelId, roomId);
	}
}