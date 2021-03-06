package edu.esprit.pfeProjectEJB.DAO;

import edu.esprit.pfeProjectEJB.DAO.interfaces.GestionPersonneLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.GestionPersonneRemote;
import edu.esprit.pfeProjectEJB.persistence.Personne;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 * Session Bean implementation class GestionPersonne
 */
@LocalBean 
@Stateless
public class GestionPersonne implements GestionPersonneRemote, GestionPersonneLocal {
	@PersistenceContext(unitName="edu.esprit.pfeProjectEJB")
	EntityManager em;
	
	public void ajouterPersonne(Personne pers) {
	em.persist(pers);
		
	}

   
	

}