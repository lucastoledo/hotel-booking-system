package com.booking.system.hotel.rooms.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
	
	@Id
	@Column(name = "room_id", nullable = false)
	private String roomId;
	
	@Column(name = "hotel_id", nullable = false)
	private String hotelId;
	
	@Column(name = "room_number", nullable = false)
	private String roomNumber;
	
	@Column(name = "rate", nullable = false)
	private BigInteger rate;
	
	@Column(name = "room_type", nullable = false)
	private String type;

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public BigInteger getRate() {
		return rate;
	}

	public void setRate(BigInteger rate) {
		this.rate = rate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Room withRoomId(String roomId) {
		this.setRoomId(roomId);
		return this;
	}
	public Room withHotelId(String hotelId) {
		this.setHotelId(hotelId);
		return this;
	}
	public Room withRoomNumber(String roomNumber) {
		this.setRoomNumber(roomNumber);
		return this;
	}
	public Room withRate(BigInteger rate) {
		this.setRate(rate);
		return this;
	}
	public Room withType(String type) {
		this.setType(type);
		return this;
	}
}
