package main.javacode.tavant.hangman.implementation;

public class WordInUpperCase {
	private String letters = null;

	public String getLetters() {
		return letters;
	}

	public WordInUpperCase(String word) {
		this.letters = word.toUpperCase();
	}
}
