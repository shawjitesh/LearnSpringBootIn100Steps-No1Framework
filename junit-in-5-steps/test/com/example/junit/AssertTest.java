package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		boolean condition = true;
		assertEquals(true, condition);
		assertTrue(condition);
		assertFalse(condition);
	}

}
