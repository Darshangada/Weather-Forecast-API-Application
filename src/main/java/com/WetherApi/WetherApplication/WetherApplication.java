package com.WetherApi.WetherApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WetherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WetherApplication.class, args);
		System.out.println("Start Application");
	}

}