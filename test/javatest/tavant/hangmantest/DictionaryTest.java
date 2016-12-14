package javatest.tavant.hangmantest;

import static org.junit.Assert.*;
import org.junit.Test;
import main.javacode.tavant.hangman.implementation.Dictionary;

public class DictionaryTest {
	@Test
	public void testGetRandomWord() {
		String actual = new Dictionary().getRandomWord();
		assertTrue(actual.length() > 0);
	}
}
