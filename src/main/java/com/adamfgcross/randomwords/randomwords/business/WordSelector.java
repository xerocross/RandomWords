package com.adamfgcross.randomwords.randomwords.business;

import java.util.List;

public interface WordSelector {
	public List<String> getWords(Integer numWords);
}
