package com.esprit.calculette;

import javax.ejb.Remote;

@Remote
public interface CalculetteBeanRemote {

	public int add(int a,int b);
	
	
	
}
