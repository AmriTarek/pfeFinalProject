package edu.esprit.pfeProjectEJB.DAO.interfaces;

import javax.ejb.Local;

import edu.esprit.pfeProjectEJB.persistence.Personne;


@Local
public interface GestionPersonneLocal {
	public void ajouterPersonne(Personne pers);

}
