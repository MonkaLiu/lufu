package com.hua.shi.core.luhucore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@MapperScan("com.hua.shi.lufudao")
@EnableEurekaClient
@EnableFeignClients("com.hua.shi.core.luhucore.proxy")
public class LuhuCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuhuCoreApplication.class, args);
	}

}
