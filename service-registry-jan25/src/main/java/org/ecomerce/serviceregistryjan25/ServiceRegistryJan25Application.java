package org.ecomerce.serviceregistryjan25;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryJan25Application {

    public static void main(String[] args) {

        SpringApplication.run(ServiceRegistryJan25Application.class, args);
    }

}
