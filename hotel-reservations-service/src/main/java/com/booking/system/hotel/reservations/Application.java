package com.booking.system.hotel.reservations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * this is the bootstrap class for the entire microservice
 * 
 * @author lucas
 *
 */
@SpringBootApplication
//@RefreshScope // allow a development team to access a /refresh endpoint that will force the
				// Spring Boot application to reread its application configuration
@EnableFeignClients
@EnableCircuitBreaker
public class Application {

	@LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate template = new RestTemplate();
        return template;
    }
	
	/*@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}