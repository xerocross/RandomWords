package com.adamfgcross.randomwords.randomwords.userinterface;

import java.util.List;

import com.adamfgcross.randomwords.randomwords.business.WordSelector;

import picocli.CommandLine;

@CommandLine.Command(name="", mixinStandardHelpOptions = true, version = "1.0")
public class ConsoleCommandImpl implements ConsoleCommand {
	private WordSelector wordSelector;
	
	public ConsoleCommandImpl (WordSelector wordSelector) {
		this.wordSelector = wordSelector;
	}
	
	@CommandLine.Option(names = {"-D"}, description = "word dictionary path")
	private String dictionaryPath;
	
	@CommandLine.Option(names = {"-n"}, description = "number of randomly-chosen words")
	private int numWords;
	
	@Override
	public void run() {
		try {
			List<String> words = wordSelector.getWords(numWords);
			System.out.println("Randomly selected words:");
			System.out.println(String.join(" ", words.toArray(new String[0])));
		}
		catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}
}
