package com.digiaxix.restaurantmenumanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantMenuManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantMenuManagementServiceApplication.class, args);
	}

}
