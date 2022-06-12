package com.example.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void findTheGreatestFromAllData() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
		assertEquals(24, someBusinessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	public void findTheGreatestFromAllData_ForOneValue() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		assertEquals(15, someBusinessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	public void findTheGreatestFromAllData_NoValues() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, someBusinessImpl.findTheGreatestFromAllData());
	}
}