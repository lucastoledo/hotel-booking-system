package com.booking.system.hotel.zuulsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@RefreshScope
@EnableZuulProxy
public class ZuulServerApplication {

	@LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
	
	/*@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
}
