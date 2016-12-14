package com.tavant.task;

public class Word implements IWord {
	private char[] letters;
	private Word word;
	private Dictionary dictionary = new Dictionary();

	public Word() {
		letters = dictionary.getRandomWord().toCharArray();
	}

	public char[] getLetters() {
		return letters;
	}

	@Override
	public String toString() {
		return new String(letters);
	}

	@Override
	public boolean equals(Object obj) {
		IncompleteWord incompleteWord = (IncompleteWord)obj;
		return letters.equals(incompleteWord.getIncompleteWord());
	}
}
