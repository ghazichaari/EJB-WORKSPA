package com.esprit.helloWebService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService
public class HelloService {

	@WebMethod
	public String sayHello(String name){
		return "hello "+name;
	}
   
    public HelloService() {
        // TODO Auto-generated constructor stub
    }

}
