package com.esprit.Traducteur.facade;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;

import com.esprit.Traducteur.Dictionnaire;
import com.esprit.Traducteur.Traducteur;
import com.esprit.Traducteur.aop.MonIntercepteur;
import com.esprit.Traducteur.log.Logger;

@Remote(TraductionService.class)

@Stateless(name="traductionService")

public class TraductionServiceImpl


implements TraductionService{

	
	
	@EJB
	Dictionnaire dictionnaire;
	
	@EJB(beanName="TraducteurENFR")
	Traducteur traducteurENFR;
	
	@EJB(beanName="TraducteurFREN")
	Traducteur traducteurFREN;
	
	
	
	//@Interceptors({MonIntercepteur.class})
	public String traduire(String mot) {
		

		
		Traducteur traducteur=null;
		
		if(dictionnaire.getMap().containsKey(mot))
			{
			traducteur=traducteurENFR;
			
			}
		if(dictionnaire.getMap().containsValue(mot))
		{
		traducteur=traducteurFREN;
		
		}
		
		String resultat=traducteur.traduire(mot);
		
		return resultat;
	}

	

}
