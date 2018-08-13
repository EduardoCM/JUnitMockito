package com.example.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void CalculateSum_basic() {
	    SomeBusinessImpl business = new SomeBusinessImpl();
	    int actualResult = business.calculateSum(new int[]{5, 6, 7});
	    int expectedResult = 18;
	   assertEquals(expectedResult, actualResult);   
	}
	
	
	@Test
	public void CalculateSum_empty() {
	    SomeBusinessImpl business = new SomeBusinessImpl();
	    int actualResult = business.calculateSum(new int[]{});
	    int expectedResult = 0;
	   assertEquals(expectedResult, actualResult);   
	}

}
