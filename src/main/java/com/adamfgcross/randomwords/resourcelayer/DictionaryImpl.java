package com.adamfgcross.randomwords.resourcelayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.core.io.Resource;

import java.util.ArrayList;

public class DictionaryImpl implements Dictionary {
		List<String> wordList;
		Resource wordListAddress;
		
		public DictionaryImpl(Resource wordListAddress) {
			this.wordListAddress = wordListAddress;
		}
		
		@Override
		public String getWord(int wordIndex) {
			return wordList.get(wordIndex);
		}
		
		@Override
		public int getSize() {
			return this.wordList.size();
		}

		@SuppressWarnings("unused")
		private void init() throws Exception {
			wordList = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(wordListAddress.getInputStream()))) {
				String line;
				while((line = reader.readLine()) != null) {
					wordList.add(line);
				}
			} catch (IOException e) {
	            throw e;
	        }
		}
}
