package com.sak.sarma.nwmontool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class NwmontoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(NwmontoolApplication.class, args);
	}

}
