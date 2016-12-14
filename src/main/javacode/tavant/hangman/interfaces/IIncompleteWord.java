package main.javacode.tavant.hangman.interfaces;

public interface IIncompleteWord {
	boolean isPresent(Character input);

	void replaceAllOccurrences(Character input);

	boolean isDashPresent();

	boolean isAlreadyInserted(Character userInput);
}
