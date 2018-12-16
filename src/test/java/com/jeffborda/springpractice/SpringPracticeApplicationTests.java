package com.jeffborda.springpractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringPracticeApplicationTests {

	@LocalServerPort
	private int port;
	@Autowired
	HelloWorldController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGreetingMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hello", String.class)).contains("Hello there!");
	}

}
