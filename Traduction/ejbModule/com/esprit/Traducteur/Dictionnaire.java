package com.esprit.Traducteur;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;


@Singleton
@Startup
@LocalBean
public class Dictionnaire {

	private Map<String, String> map=
			new HashMap<String, String>();

	
	public Dictionnaire() {
		map.put("hello", "salut");
		map.put("good morning", "bonjour");
		map.put("good evening", "bonsoir");
	}
	
	
public Map<String, String> getMap() {
	return map;
}

	

}
