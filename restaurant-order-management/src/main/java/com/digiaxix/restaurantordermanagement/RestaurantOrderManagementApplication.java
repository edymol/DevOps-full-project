package com.digiaxix.restaurantordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantOrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantOrderManagementApplication.class, args);
	}

}
