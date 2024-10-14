package com.digiaxix.restaurantusermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantUserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantUserManagementApplication.class, args);
	}

}
