package com.esprit.Traducteur.aop;



import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.esprit.Traducteur.log.Logger;



public class MonIntercepteur {

	Logger logger=new Logger();
	
	@AroundInvoke
	public Object log(InvocationContext iContext)
			throws Exception
	
	{
		
		
		String mot=iContext
				.getParameters()[0].toString();
		logger.info("mot envoyé: "+mot)	;	
		
		//logger.info("resultat"+iContext.get);
		return iContext.proceed();
	}
	
}
