package com.esprit.Traducteur;

import java.util.Map;
import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name="TraducteurFREN")
public class TraducteurFRENImpl implements Traducteur{

	@EJB
	Dictionnaire dictionnaire;
	
	public String traduire(String mot) {
		Map<String, String> map=
				dictionnaire.getMap();
		Set<String> motsEN= map.keySet();

		for(String m:motsEN){
			String val=map.get(m);
			if(val.equals(mot)) return m;
		}
		return null;
	}

}
