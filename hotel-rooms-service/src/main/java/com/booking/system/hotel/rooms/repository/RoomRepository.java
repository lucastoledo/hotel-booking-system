package com.booking.system.hotel.rooms.repository;

import org.springframework.data.repository.CrudRepository;

import com.booking.system.hotel.rooms.model.Room;

public interface RoomRepository extends CrudRepository<Room, String> {

	public Room findByRoomId(String roomId);
	
	public Room findByHotelIdAndRoomNumber(String hotelId, String roomNumber);
}
