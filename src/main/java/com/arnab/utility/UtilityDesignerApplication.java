package com.arnab.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class UtilityDesignerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityDesignerApplication.class, args);
	}

}
