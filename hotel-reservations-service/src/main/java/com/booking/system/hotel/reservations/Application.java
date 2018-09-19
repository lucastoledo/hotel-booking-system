package com.booking.system.hotel.reservations;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.booking.system.hotel.reservations.utils.UserContextInterceptor;

/**
 * this is the bootstrap class for the entire microservice
 * 
 * @author lucas
 *
 */
@SpringBootApplication
@RefreshScope // allow a development team to access a /refresh endpoint that will force the
				// Spring Boot application to reread its application configuration
@EnableFeignClients
@EnableCircuitBreaker
public class Application {

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate template = new RestTemplate();
		List interceptors = template.getInterceptors();
		if (interceptors == null) {
			template.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
		} else {
			interceptors.add(new UserContextInterceptor());
			template.setInterceptors(interceptors);
		}

		return template;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}