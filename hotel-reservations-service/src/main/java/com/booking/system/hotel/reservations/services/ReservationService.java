package com.booking.system.hotel.reservations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.system.hotel.reservations.model.Reservation;
import com.booking.system.hotel.reservations.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
    private ReservationRepository reservationRepository;
	
	public List<Reservation> getReservationsByHotelIdAndRoomId(String roomId) {
		
		return reservationRepository.findByRoomId(roomId);
	}
}
