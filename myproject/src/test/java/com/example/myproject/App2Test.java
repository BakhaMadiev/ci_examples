package com.example.myproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class App2Test {
	private App app;
	
	@Before
	public void setup() {
		app = new App();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}
}
