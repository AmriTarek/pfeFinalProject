package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.Fournisseur;

@Remote
public interface FournisseurDAORemote {
	public void createFournisseur(Fournisseur fournisseur) ;
	public void updateFournisseur(Fournisseur fournisseur) ;
	public void deleteFournisseur(Fournisseur fournisseur) ;
	public Fournisseur readById(int id ) ;
	public List<Fournisseur> getAllFournisseurs() ;
}
