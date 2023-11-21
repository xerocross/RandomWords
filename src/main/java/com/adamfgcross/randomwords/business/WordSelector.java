package com.adamfgcross.randomwords.business;

import java.util.List;

public interface WordSelector {
	public List<String> getWords(Integer numWords);
}
