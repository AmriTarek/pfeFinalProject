package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.pfeProjectEJB.persistence.BonLivraison;
import edu.esprit.pfeProjectEJB.persistence.Facture;

@Local
public interface FactureDAOLocal {
	public void createFacture(Facture facture) ;
	public void updateFacture(Facture facture) ;
	public void deleteFacture(Facture facture) ;
	public Facture readById(int id) ;
	public List<Facture> getAllFacture() ;

}
