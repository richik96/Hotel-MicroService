package org.ecomerce.ratingservicejan25;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingServiceJan25Application {

    public static void main(String[] args) {
        SpringApplication.run(RatingServiceJan25Application.class, args);
    }

}
