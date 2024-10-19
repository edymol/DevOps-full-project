package com.digiaxix.restaurantcentralconfiguration.controller;

import com.digiaxix.restaurantcentralconfiguration.RestaurantCentralConfigurationApplication;
import com.digiaxix.restaurantcentralconfiguration.bean.RestaurantCentralConfiguration;
import com.digiaxix.restaurantcentralconfiguration.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentralConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public RestaurantCentralConfiguration centralConfiguration() {
        return new RestaurantCentralConfiguration(configuration.getMin(), configuration.getMax());
    }
}
