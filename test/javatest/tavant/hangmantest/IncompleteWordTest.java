package javatest.tavant.hangmantest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.javacode.tavant.hangman.implementation.IncompleteWord;
import main.javacode.tavant.hangman.implementation.WordInUpperCase;

public class IncompleteWordTest {

	@Test
	public void testIsPresent() {
		// Arrange
		WordInUpperCase word = new WordInUpperCase("TestWord");
		IncompleteWord incompleteWord = new IncompleteWord(word);
		Boolean expected = true;
		Boolean actual = null;

		// ACT
		actual = incompleteWord.isPresent('t');

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testReplaceAllOccurance() {
		// Arrange
		WordInUpperCase word = new WordInUpperCase("TestWord");
		IncompleteWord incompleteWord = new IncompleteWord(word);
		String expected = "T--T----";
		String actual = null;

		// Act
		incompleteWord.replaceAllOccurrences('t');
		actual = incompleteWord.getWordWithDashes();

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testIsDashPresent() {
		// Arrange for pass condition
		WordInUpperCase word = new WordInUpperCase("TestWord");
		IncompleteWord incompleteWord = new IncompleteWord(word);
		Boolean expected = true;
		Boolean actual = null;

		// Act
		actual = incompleteWord.isDashPresent();

		// Arrange
		assertEquals(expected, actual);

		// Arrange for Fail Condition
		word = new WordInUpperCase("T");
		incompleteWord = new IncompleteWord(word);
		expected = false;
		actual = null;

		// Act
		incompleteWord.replaceAllOccurrences('t');
		actual = incompleteWord.isDashPresent();

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testIsAlreadyPresent() {
		// Arrange for pass condition
		WordInUpperCase word = new WordInUpperCase("TestWord");
		IncompleteWord incompleteWord = new IncompleteWord(word);
		Boolean expected = true;
		Boolean actual = null;

		// Act
		incompleteWord.replaceAllOccurrences('t');
		actual = incompleteWord.isAlreadyInserted('t');

		// Assert
		assertEquals(expected, actual);
		
		// Arrange for fail condition
		word = new WordInUpperCase("TestWord");
		incompleteWord = new IncompleteWord(word);
		expected = false;
		actual = null;

		// Act
		actual = incompleteWord.isAlreadyInserted('t');

		// Assert
		assertEquals(expected, actual);
	}

}
