package com.adamfgcross.randomwords;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.adamfgcross.randomwords.userinterface.ConsoleCommand;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import picocli.CommandLine;

@SpringBootApplication
@ImportResource("classpath:app-context.xml")
public class RandomwordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomwordsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner picocliRunner(ConsoleCommand consoleCommand) {
		return args -> new CommandLine(consoleCommand).execute(args);
	}
}
