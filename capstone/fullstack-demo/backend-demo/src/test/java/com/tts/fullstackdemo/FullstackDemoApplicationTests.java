package com.tts.fullstackdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// we need to comment the annotation out because
// this will attempt to provision a database
// which is impossible with our github actions workflow
//@SpringBootTest
class FullstackDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
