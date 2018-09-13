package com.booking.system.hotel.reservations.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booking.system.hotel.reservations.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, String> {
	
	public List<Reservation> findByRoomId(String roomId);
	
}