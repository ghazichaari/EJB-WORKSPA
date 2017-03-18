package com.esprit.Traducteur.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.esprit.Traducteur.Traducteur;
import com.esprit.Traducteur.util.Locator;

public class TraducteurFRENTraduireTest {

	Traducteur traducteur;
	
	@Before
	public void setUp() throws Exception {
		traducteur=(Traducteur) 
				Locator
				.lookup("/Traduction//TraducteurFREN!com.esprit.Traducteur.Traducteur");
		
	}

	@Test
	public void test() {
	
		
		assertEquals("ok", "good evening", traducteur.traduire("bonsoir"));
	}

}
