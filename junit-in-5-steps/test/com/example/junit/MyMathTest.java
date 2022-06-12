package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	MyMath myMath = new MyMath();

	@Test
	public void sumWith3Numbers() {
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}
	
	@Test
	public void sumWith1Number() {		
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
