package com.tavant.task;

import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
	private ArrayList<String> listOfWords = new ArrayList<String>();

	public Dictionary() {
		listOfWords.addAll(Arrays.asList("writer", "that", "program", "computer", "java", "shoe", "shooter", "apple","pineapple"));
	}

	public String getRandomWord() {
		return listOfWords.get((int) (Math.random() * (listOfWords.size() - 1)));
	}
}
