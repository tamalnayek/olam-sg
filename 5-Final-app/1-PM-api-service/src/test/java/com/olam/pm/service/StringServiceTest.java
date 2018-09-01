package com.olam.pm.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringServiceTest {

	private StringService stringService;

	@Before
	public void setUp() {
		stringService = new StringService();
	}

	@Test
	public void positiveTest() {
		String str = "olam";
		int len = stringService.getStringLength(str);
		assertEquals(4, len);
	}

}
