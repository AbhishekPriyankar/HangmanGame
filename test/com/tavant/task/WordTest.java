package com.tavant.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordTest {
	Word word;
	IncompleteWord incompleteWord;

	@Test
	public void testEquals2() {
		incompleteWord = new IncompleteWord();
		word = new Word();
		assertNotNull(word.equals(incompleteWord));
	}
}
