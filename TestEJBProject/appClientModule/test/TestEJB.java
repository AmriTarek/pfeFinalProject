package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import edu.esprit.pfeProjectEJB.domain.management.interfaces.GestionPersonneRemote;
import edu.esprit.pfeProjectEJB.persistence.Personne;

public class TestEJB {
	public TestEJB ()  {
		
	}

	public static void main(String[] args) throws NamingException {
		System.out.println("*************************");

		Context jndiContext = new InitialContext();
		Object ref = jndiContext.lookup("ejb:edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/GestionPersonne!edu.esprit.pfeProjectEJB.domain.management.interfaces.GestionPersonneRemote");
		
		GestionPersonneRemote gpr = (GestionPersonneRemote)ref;

		Personne pers1 =new Personne();
		pers1.setNcin(11);
		pers1.setNom("tarek");
		gpr.ajouterPersonne(pers1);
		
	}}