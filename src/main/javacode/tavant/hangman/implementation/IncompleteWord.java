package main.javacode.tavant.hangman.implementation;

import org.apache.commons.lang3.StringUtils;
import main.javacode.tavant.hangman.interfaces.IIncompleteWord;

public class IncompleteWord implements IIncompleteWord {

	private WordInUpperCase word;
	private String wordWithDashes;

	public IncompleteWord(WordInUpperCase word) {
		super();
		this.word = word;
		wordWithDashes = StringUtils.repeat("-", word.getLetters().length());
	}

	public String getWordWithDashes() {
		return wordWithDashes;
	}

	public boolean isPresent(Character input) {
		return word.getLetters().contains(input.toString().toUpperCase());
	}

	public void replaceAllOccurrences(Character input) {
		input = Character.toUpperCase(input);
		for (int i = 0; i < word.getLetters().length(); i++) {
			if (word.getLetters().charAt(i) == input) {
				replaceDashWith(input, i);
			}
		}
	}

	private void replaceDashWith(Character input, int index) {
		char[] characters = wordWithDashes.toCharArray();
		characters[index] = input;
		wordWithDashes = new String(characters);
	}

	public boolean isDashPresent() {
		return wordWithDashes.contains("-");
	}

	public boolean isAlreadyInserted(Character userInput) {
		return wordWithDashes.contains(userInput.toString().toUpperCase());
	}
}
