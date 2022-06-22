package com.example.restfull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestfullApplication {

	private static final Logger log = LoggerFactory.getLogger(RestfullApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestfullApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			RandomPost post = restTemplate.getForObject("https://dummyjson.com/posts/1", RandomPost.class);
			log.info(post.toString());
		};
	}

}
