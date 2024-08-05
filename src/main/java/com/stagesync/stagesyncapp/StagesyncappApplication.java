package com.stagesync.stagesyncapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.stagesync.stagesyncapp.repository")
public class StagesyncappApplication {

	@Value("${MONGODB_DATABASE:dummy_database}")
	private String database;

	@Value("${MONGODB_URI:mongodb://localhost:27017}")
	private String mongoUri;

	public static void main(String[] args) {
		SpringApplication.run(StagesyncappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("MONGODB_DATABASE: " + database);
			System.out.println("MONGODB_URI: " + mongoUri);
		};
	}
}
