package com.digiaxix.restaurantadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class RestaurantAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantAdminServerApplication.class, args);
    }

}
