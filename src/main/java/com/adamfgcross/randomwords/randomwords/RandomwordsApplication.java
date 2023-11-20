package com.adamfgcross.randomwords.randomwords;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import com.adamfgcross.randomwords.randomwords.userinterface.ConsoleCommand;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import picocli.CommandLine;

@SpringBootApplication
@ImportResource("classpath:app-context.xml")
public class RandomwordsApplication {


	/*
	 * args[1] should be the number of random words desired
	 */
	public static void main(String[] args) {
		SpringApplication.run(RandomwordsApplication.class, args);
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
//		WordSelector ws = ctx.getBean("wordSelector", WordSelector.class);
//		try {
//			int numWords = Integer.parseInt(args[1]);
//			List<String> words = ws.getWords(numWords);
//			String[] wordsArray = (String[]) words.toArray();
//			System.out.println("Randomly selected words:");
//			System.out.println(String.join(" ", wordsArray));
//		} catch (NumberFormatException e) {
//			throw new IllegalArgumentException("Invalid argument supplied for number of random words.");
//		}
	}
	
	@Bean
	public CommandLineRunner picocliRunner(ConsoleCommand consoleCommand) {
		return args -> new CommandLine(consoleCommand).execute(args);
	}
}
