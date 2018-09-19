package com.booking.system.hotel.reservations.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booking.system.hotel.reservations.model.Room;

/**
 * this class is used in conjunction with service discovery server which will locate where the hotel-rooms-service will live
 * @author lucas
 *
 */
@FeignClient("hotel-rooms-service") // client name
public interface RoomsFeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "v1/hotels/{hotelId}/rooms/{roomId}", consumes = "application/json")
	Room getRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId);
}
