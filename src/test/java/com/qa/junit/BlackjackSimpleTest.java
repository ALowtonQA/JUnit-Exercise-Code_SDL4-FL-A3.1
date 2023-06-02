package com.qa.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackjackSimpleTest {

	@Test
	public void dealerBustTest() {
		BlackjackSimple blackjack = new BlackjackSimple();
		
		// assertEquals(expected, actual)
		assertEquals(21, blackjack.play(22, 21));
	}
	
	@Test
	public void playerBustTest() {
		
	}
	
	@Test
	public void bothBustTest() {
		
	}
	
	@Test
	public void highestValueWinsTest() {
		
	}
	
}
