package com.esprit.ws.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HellServiceSayHelloTest {

	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void test() {
	
		HelloService helloService=
				new HelloServiceService()
		.getHelloServicePort();
		
		assertEquals("hello esprit", helloService.sayHello("esprit"));
	}

}
