package com.digiaxix.restaurantcentralconfiguration.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Data
@NoArgsConstructor
@EnableDiscoveryClient
@ToString
@AllArgsConstructor
public class RestaurantCentralConfiguration {
    private int min;
    private int max;
}
