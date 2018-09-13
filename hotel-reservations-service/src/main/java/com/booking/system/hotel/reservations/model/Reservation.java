package com.booking.system.hotel.reservations.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation {
	
	@Id
	@Column(name = "reservation_id", nullable = false)
	private String reservationId;
	
	@Column(name = "room_id", nullable = false)
	private String roomId;
	
	@Column(name = "guest_id", nullable = false)
	private String guestId;
	
	@Column(name = "start_date", nullable = false)
	private LocalDateTime startDate;
	
	@Column(name = "end_date", nullable = false)
	private LocalDateTime endDate;
	
	@Column(name = "comment", nullable = false)
	private String comment;
	
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
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
	
	public Reservation withReservationId(String reservationId) {
		this.setReservationId(reservationId);
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
}
