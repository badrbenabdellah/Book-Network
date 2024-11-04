package com.badr.booknetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BookNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookNetworkApplication.class, args);
	}

}
