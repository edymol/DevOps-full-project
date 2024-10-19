package com.digiaxix.restaurantcentralconfiguration.controller;

import com.digiaxix.restaurantcentralconfiguration.bean.RestaurantCentralConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantCentralConfigurationController {

    @GetMapping("/central")
    public RestaurantCentralConfiguration getRestaurantCentralConfiguration() {
        return new RestaurantCentralConfiguration(1, 1000);
    }
}
