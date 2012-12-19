package edu.esprit.pfeProjectEJB.domain.management.interfaces;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.Personne;


@Remote
public interface GestionPersonneRemote {
	public void ajouterPersonne(Personne pers);

}
