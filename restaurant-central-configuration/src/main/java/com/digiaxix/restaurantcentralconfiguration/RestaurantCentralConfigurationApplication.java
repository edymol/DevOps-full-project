package com.digiaxix.restaurantcentralconfiguration;

import com.digiaxix.restaurantcentralconfiguration.config.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class RestaurantCentralConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantCentralConfigurationApplication.class, args);
	}

}
