package ctrl;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import edu.esprit.pfeProjectEJB.DAO.interfaces.FournisseurDAORemote;
import edu.esprit.pfeProjectEJB.persistence.Fournisseur;

@ManagedBean		
@SessionScoped
public class GererFournCtrl {
	
	Fournisseur fournisseur = new Fournisseur() ;
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}


	private List<Fournisseur> listFour ;
	
	@EJB
	FournisseurDAORemote remfr ;
	
	 public void ajoutEvent(ActionEvent actionEvent) {
	        fournisseur = new Fournisseur();
	 }
	
	public String doCreateFourn(ActionEvent actionEvent)
	{
		FacesContext context=FacesContext.getCurrentInstance();
		try {
remfr.createFournisseur(fournisseur) ;
fournisseur = new Fournisseur() ;
FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Création réuissite");
context.addMessage(null, message);
}catch(Exception e){

	FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erreur","Erreur de création");
	context.addMessage(null, message);
}
return "";
	}
	
	
	public void doDeleteFour(Fournisseur fournisseur) {
		FacesContext context = FacesContext.getCurrentInstance() ;
		remfr.deleteFournisseur(fournisseur) ;
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Suppression réuissite");
		context.addMessage(null, message);

	}
	
	public void doUpdateFour(ActionEvent actionEvent) {
		FacesContext context = FacesContext.getCurrentInstance() ;
remfr.updateFournisseur(fournisseur) ;
FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Mise à jour réuissite");
context.addMessage(null, message);

		
	}

	

	public List<Fournisseur> getListFour() {
		listFour = remfr.getAllFournisseurs() ;
		
		return listFour;
	}

	public void setListFour(List<Fournisseur> listFour) {
		this.listFour = listFour;
	}
	
	
	public void editEvent(int id) {
        System.out.print(id);
        
        fournisseur = remfr.readById(id); } 
 
	
	
	

}
