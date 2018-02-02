package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
		return restTemplateBuilder.build();
	}

	@Bean

	public CommandLineRunner runner(RestTemplate restTemplate) throws Exception{
		return args ->{
			SingleArtistsInformation singleArtistsInformation = restTemplate.getForObject(
			"https://rest.bandsintown.com/artists/Avenged Sevenfold?app_id=SingleArtistInformation", SingleArtistsInformation.class);
					log.info(singleArtistsInformation.toString());

		};
	}
}
