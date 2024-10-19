package com.digiaxix.restaurantconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RestaurantConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantConfigServerApplication.class, args);
	}

}
