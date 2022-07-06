package com.oreo.friendYOL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FriendYolApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendYolApplication.class, args);
	}

}
