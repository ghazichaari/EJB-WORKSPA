package com.esprit.Traducteur.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.esprit.Traducteur.Traducteur;
import com.esprit.Traducteur.facade.TraductionService;
import com.esprit.Traducteur.util.Locator;

public class TraducteurENFRTraduireTest {

	 TraductionService traductionService;
	
	@Before
	public void setUp() {
	traductionService=
    (TraductionService)
    Locator.lookup("/Traduction//traductionService!com.esprit.Traducteur.facade.TraductionService");

	}
	
	@Test
	public void test() {

		Assert.assertNotNull("Ok",traductionService);
			
		System.out.println(traductionService.traduire("hello"));
		
		
		
		
	}

}
