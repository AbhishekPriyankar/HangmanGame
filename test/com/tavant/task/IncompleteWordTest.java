package com.tavant.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class IncompleteWordTest {
	IncompleteWord incompleteWord;
	Dictionary dictionary;
	Word word;
	
	@Test
	public void testIncompleteWord1(){
		IncompleteWord incomplete = new IncompleteWord();
		assertTrue(incomplete.toString().contains("_"));
	}

	@Test
	public void testisEqual() {
		incompleteWord = new IncompleteWord();
		word = new Word();
		assertNotNull(incompleteWord.isEqual());
	}
}
