package com.app.Anatool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AnatoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnatoolApplication.class, args);
	}

}
