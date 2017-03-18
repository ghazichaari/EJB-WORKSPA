package com.esprit.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2012-10-29T16:56:06.277+01:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "http://helloWebService.esprit.com/", name = "HelloService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://helloWebService.esprit.com/", className = "com.esprit.ws.client.SayHello")
    @WebMethod
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://helloWebService.esprit.com/", className = "com.esprit.ws.client.SayHelloResponse")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}