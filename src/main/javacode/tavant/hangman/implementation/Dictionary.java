package main.javacode.tavant.hangman.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import main.javacode.tavant.hangman.interfaces.IDictionary;

public class Dictionary implements IDictionary {
	private ArrayList<String> wordList = new ArrayList<String>();

	public Dictionary() {
		wordList.addAll(Arrays.asList("books", "smile", "swing", "socks", "heart", "apple", "whale"));
	}

	public String getRandomWord() {
		return wordList.get((int) (Math.random() * (wordList.size() - 1)));
	}
}
