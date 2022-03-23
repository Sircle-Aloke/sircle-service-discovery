package com.alk.sircleservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SircleServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SircleServiceDiscoveryApplication.class, args);
	}

}
