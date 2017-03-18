package com.esprit.calculette.client;

import static org.junit.Assert.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

import com.esprit.calculette.CalculetteBean;
import com.esprit.calculette.CalculetteBeanRemote;

public class CalculetteAddTest {

	@Test
	public void test() {
		
		Context context=null;
		 
		try {
			
			context=new InitialContext();
			
			CalculetteBeanRemote calc=
					(CalculetteBeanRemote) 
					context.
					lookup("/firstEJB//CalculetteBean!com.esprit.calculette.CalculetteBeanRemote");
			
			System.out.println(calc.add(10, 20));
			
		} catch (NamingException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
