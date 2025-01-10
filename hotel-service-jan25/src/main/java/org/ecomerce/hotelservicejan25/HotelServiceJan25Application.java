package org.ecomerce.hotelservicejan25;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelServiceJan25Application {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceJan25Application.class, args);
    }

}
