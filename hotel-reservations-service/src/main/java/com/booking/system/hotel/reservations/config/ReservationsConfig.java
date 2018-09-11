package com.booking.system.hotel.reservations.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReservationsConfig {

	@Value("${example.property}")
	private String exampleProperty;

	public String getExampleProperty() {
		return exampleProperty;
	}
}
