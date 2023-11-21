package com.adamfgcross.randomwords.userinterface;

import java.util.List;

import com.adamfgcross.randomwords.business.InvalidNumberException;
import com.adamfgcross.randomwords.business.WordSelector;

public class ControllerImpl implements Controller {
	WordSelector wordSelector;
	
	public ControllerImpl(WordSelector wordSelector) {
		this.wordSelector = wordSelector;
		
	}
	
	/*
	 * Primary user interface control flow logic
	 */
	public void run(Options options) {
		if (options.getNumWords() != null) {
			nonInteractive(options.getNumWords());
		}
	}
	
	public void nonInteractive(int numWords) {
		try {
			
			List<String> words = wordSelector.getWords(numWords);
			System.out.println("Randomly selected words:");
			System.out.println(String.join(" ", words.toArray(new String[0])));
		}
		catch (InvalidNumberException e) {
			System.out.println("The numWords value must be a positive integer.");
		}
		catch (Exception e) {
			System.out.println("An unexpected error has occurred. Sorry.");
			System.out.println(e.getMessage().toString());
		}
	}
	
	public void interactive() {
		
	}
}
