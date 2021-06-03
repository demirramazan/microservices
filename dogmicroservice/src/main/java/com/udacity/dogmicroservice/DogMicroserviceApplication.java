package com.udacity.dogmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableJpaRepositories
public class DogMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogMicroserviceApplication.class, args);
    }

}
