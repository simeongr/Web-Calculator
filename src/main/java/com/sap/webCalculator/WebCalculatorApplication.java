package com.sap.webCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.sap.webCalculator")
@SpringBootApplication
public class WebCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCalculatorApplication.class, args);
	}

}
