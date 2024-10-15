package com.digiaxix.restaurantmenumanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RestaurantMenuManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantMenuManagementServiceApplication.class, args);
	}

}
