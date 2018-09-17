package com.booking.system.hotel.reservations.model;

import java.math.BigInteger;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Room {

	private String roomId;

	private String hotelId;

	private String roomNumber;

	private BigInteger rate;

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

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
