package com.booking.system.hotel.reservations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * this is the bootstrap class for the entire microservice
 * @author lucas
 *
 */
@SpringBootApplication 
public class Application { 
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}