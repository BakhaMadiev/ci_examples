package com.example.myproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	public App myApp;
	
	@Before
	public void setup() {
		myApp = new App();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Hello", myApp.sayHello());
	}
}
