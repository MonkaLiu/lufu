package com.hua.shi.lufueureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LufuEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LufuEurekaApplication.class, args);
	}

}
