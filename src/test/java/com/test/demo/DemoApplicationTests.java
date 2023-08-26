package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest(properties = {"value=test", "property.value=propertyTest"},
		classes = DemoApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Value("${value}")
	private String value;

	@Value("${property.value}")
	private String propertyValue;

	@Test
	void contextLoads() {
		assertThat(value, is("test"));
		assertThat(propertyValue, is("propertyTest"));
	}

}





