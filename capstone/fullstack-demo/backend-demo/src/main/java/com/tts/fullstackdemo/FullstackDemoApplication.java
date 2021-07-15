package com.tts.fullstackdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

//@Slf4j
@SpringBootApplication
public class FullstackDemoApplication {

	public static void main(String[] args) {

		Arrays.stream(args).forEach(System.out::println);
		SpringApplication.run(FullstackDemoApplication.class, args);
//		log.error("Hello from a logger!");
	}

}
