package com.esprit.calculette;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculetteBean
 */
@Stateless
public class CalculetteBean implements CalculetteBeanRemote {

    /**
     * Default constructor. 
     */
    public CalculetteBean() {
        // TODO Auto-generated constructor stub
    }

	
	public int add(int a, int b) {
		
		return a+b;
	}



}
