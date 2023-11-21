package com.adamfgcross.randomwords.business;

import java.util.List;

import com.adamfgcross.randomwords.resourcelayer.Dictionary;

import java.util.ArrayList;
import java.security.SecureRandom;

public class WordSelectorImpl implements WordSelector {
	private Dictionary dictionary;
	
	public WordSelectorImpl(Dictionary dictionary) throws EmptyDictionaryException {
		this.dictionary = dictionary;
		if (dictionary.getSize() == 0) {
			throw new EmptyDictionaryException();
		}
	}
	
	@Override
	public List<String> getWords(Integer numWords) throws InvalidNumberException {
		if (numWords == null || numWords <= 0) {
			throw new InvalidNumberException();
		}
		List<String> words = new ArrayList<>();
		for(int i = 0 ; i< numWords; i++) {
			words.add(getRandomWord());
		}
		return words;
	}
	
	private String getRandomWord() {
		int max = dictionary.getSize();
		int randomIndex = getRandomInteger(max);
		return dictionary.getWord(randomIndex);
	}

	private int getRandomInteger(int max) {
		SecureRandom secureRandom = new SecureRandom();
		return secureRandom.nextInt(max);
	}
}
