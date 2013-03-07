package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.Facture;

@Remote
public interface FactureDAORemote {
	
	public void createFacture(Facture facture) ;
	public void updateFacture(Facture facture) ;
	public void deleteFacture(Facture facture) ;
	public Facture readById(int id) ;
	public List<Facture> getAllFacture() ;

}
