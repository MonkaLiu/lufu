package com.hua.shi.lufuorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LufuOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LufuOrderApplication.class, args);
	}

}
