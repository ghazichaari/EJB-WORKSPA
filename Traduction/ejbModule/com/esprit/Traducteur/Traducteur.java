package com.esprit.Traducteur;

import javax.ejb.Local;


@Local
public interface Traducteur {

 String traduire(String mot);
 
}
