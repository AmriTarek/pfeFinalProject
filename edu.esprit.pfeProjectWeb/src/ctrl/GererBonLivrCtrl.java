package ctrl;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import edu.esprit.pfeProjectEJB.DAO.interfaces.BonLivraisonDAORemote;
import edu.esprit.pfeProjectEJB.persistence.BonLivraison;



@ManagedBean
@SessionScoped
public class GererBonLivrCtrl {
	
	
	private BonLivraison bonlivraison = new BonLivraison() ;
	private List<BonLivraison> listbonlivr ;
	@EJB
	BonLivraisonDAORemote remliv ;
	
	
	 public void ajoutEvent(ActionEvent actionEvent) {
	        bonlivraison = new BonLivraison();
	 }
	public String doAddBonLivr(ActionEvent actionEvent) {
		
		FacesContext context = FacesContext.getCurrentInstance() ;
		try {
		remliv.createBonLivraison(bonlivraison) ;
		bonlivraison=new BonLivraison() ;
		
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Création réuissite");
		context.addMessage(null, message);
}catch(Exception e){

			FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erreur","Erreur de création");
			context.addMessage(null, message);
}
		return "";
		
		
	}
	
	public void doDeleteBonLivr(BonLivraison bonLivraison) {
		FacesContext context = FacesContext.getCurrentInstance() ;
		remliv.deleteBonLivraison(bonLivraison) ;
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Suppression réuissite");
		context.addMessage(null, message);
		
	}
	
	
	public void doUpdateBonLivr(ActionEvent actionEvent) {
		FacesContext context = FacesContext.getCurrentInstance() ;
        remliv.updateBonLivraison(bonlivraison) ;
        FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Mise à jour réuissite");
		context.addMessage(null, message);
		
	}
	
	
	public List<BonLivraison> getListbonlivr() {
		listbonlivr=remliv.getAllBonLivraison() ;
		return listbonlivr;
	}
	public void setListbonlivr(List<BonLivraison> listbonlivr) {
		this.listbonlivr = listbonlivr;
	}
	
	public BonLivraison getBonlivraison() {
		return bonlivraison;
	}
	public void setBonlivraison(BonLivraison bonlivraison) {
		this.bonlivraison = bonlivraison;
	}
	
	public void editEvent(int id ) {
		System.out.println(id);
		bonlivraison = remliv.readById(id); 
	}

}
