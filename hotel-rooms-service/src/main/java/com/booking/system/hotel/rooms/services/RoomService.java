package com.booking.system.hotel.rooms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.system.hotel.rooms.model.Room;
import com.booking.system.hotel.rooms.repository.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	public Room getRoomById(String roomId) {
		return roomRepository.findByRoomId(roomId);
	}

	public Room getRoomByHotelIdAndRoomNumber(String hotelId, String roomNumber) {
		return roomRepository.findByHotelIdAndRoomNumber(hotelId, roomNumber);
	}
}
