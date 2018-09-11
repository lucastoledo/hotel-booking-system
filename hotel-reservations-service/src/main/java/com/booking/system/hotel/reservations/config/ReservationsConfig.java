package com.booking.system.hotel.reservations.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReservationsConfig {

	@Value("${example.property}")
	private String exampleProperty;
	
	@Value("${example.encrypted}")
	private String exampleEncoded;

	public String getExampleProperty() {
		return exampleProperty;
	}
	
	public String getExampleEncoded() {
		return exampleEncoded;
	}
	
}
