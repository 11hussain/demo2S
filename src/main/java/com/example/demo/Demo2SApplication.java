package com.example.demo;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2SApplication {
	
	//public static Logger logger = (Logger) LoggerFactory.getLogger(Demo2SApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo2SApplication.class, args);
		//logger.info("its Test for jenkins");
		System.out.println("its Test for jenkins");
	}

}
