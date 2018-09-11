package com.booking.system.hotel.reservations.model;

import java.time.LocalDateTime;

public class Reservation {
	private String id;
	private String roomId;
	private String guestId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String comment;
	private String encodedComment;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getEncodedComment() {
		return encodedComment;
	}
	public void setEncodedComment(String encodedComment) {
		this.encodedComment = encodedComment;
	}
	public Reservation withId(String id) {
		this.setId(id);
		return this;
	}
	public Reservation withRoomId(String roomId) {
		this.setRoomId(roomId);
		return this;
	}
	public Reservation withGuestId(String guestId) {
		this.setGuestId(guestId);
		return this;
	}
	public Reservation withStartDate(LocalDateTime startDate) {
		this.setStartDate(startDate);
		return this;
	}
	public Reservation withEndDate(LocalDateTime endDate) {
		this.setEndDate(endDate);
		return this;
	}
	public Reservation withComment(String comment) {
		this.setComment(comment);
		return this;
	}
	public Reservation withEncodedComment(String encodedComment) {
		this.setEncodedComment(encodedComment);
		return this;
	}
	
}
