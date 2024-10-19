package com.digiaxix.restaurantcentralconfiguration.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("restaurant-central-configuration")
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
@Component
@Getter
public class Configuration {
    private int min;
    private int max;
}
