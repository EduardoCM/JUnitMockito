package com.example.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.data.SomeDataService;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest2 {

	@InjectMocks
	SomeBusinessImpl business;
	//SomeBusinessImpl business = new SomeBusinessImpl();
	
	@Mock
	SomeDataService dataServiceMock;
	//SomeDataService dataServiceMock = mock(SomeDataService.class);

	/*
	@Before
	public void before() {
		business.setSomeDataService(dataServiceMock);
	}
	*/

	@Test
	public void calculateSumUsingDataService_basic() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5, 6, 7 });
		assertEquals(18, business.calculateSumUsingDataService());
	}
	
	@Test
	public void calculateSumUsingDataService_empty() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingDataService());
	}

}
