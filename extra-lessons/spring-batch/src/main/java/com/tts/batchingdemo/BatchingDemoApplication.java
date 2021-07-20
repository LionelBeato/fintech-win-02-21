package com.tts.batchingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchingDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BatchingDemoApplication.class, args);
		System.exit(SpringApplication.exit(SpringApplication.run(BatchingDemoApplication.class, args)));

	}

}
