package com.esprit.Traducteur;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name="TraducteurENFR")
public class TraducteurENFRImpl implements Traducteur{

	@EJB
	Dictionnaire dictionnaire;
	
	public String traduire(String mot) {

		return dictionnaire.getMap().get(mot);
	}

}
