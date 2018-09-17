package com.booking.system.hotel.rooms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.system.hotel.rooms.model.Room;
import com.booking.system.hotel.rooms.services.RoomService;

@RestController
@RequestMapping(value="v1/hotels/{hotelId}/rooms")
public class RoomServiceController {
	
	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value="/{roomId}",method = RequestMethod.GET)
	public Room getRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId){
		return roomService.getRoomById(roomId);
	}
	
	@RequestMapping(value= {"/room-number/{roomNumber}"},method = RequestMethod.GET)
	public Room getRoomByHotelIdAndRoomNumber(@PathVariable("hotelId") String hotelId, @PathVariable("roomNumber") String roomNumber){
		return roomService.getRoomByHotelIdAndRoomNumber(hotelId, roomNumber);
	}
}
