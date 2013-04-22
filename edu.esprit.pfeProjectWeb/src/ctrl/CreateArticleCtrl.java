package ctrl;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.persistence.Article;

@ManagedBean
@SessionScoped
public class CreateArticleCtrl {
	
	
	private Article article = new Article();
	int code_Art ;
	int quantit� ;
	
	
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
	private List<Article> listArticle ;
	
	@EJB
	ArticleDaoRemote remote;
	
	
	 public void ajoutEvent(ActionEvent actionEvent) {
	        article = new Article();
	 }

	public String doAddArticle(ActionEvent actionEvent) {
		FacesContext context=FacesContext.getCurrentInstance();
try { 
		remote.createArticle(article);
		article= new Article();
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Cr�ation r�uissite");
		context.addMessage(null, message);
}catch(Exception e){

			FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erreur","Erreur de cr�ation");
			context.addMessage(null, message);
}
		return "";
	}

	
	public void doDeleteArticle(Article article) {
		
		FacesContext context = FacesContext.getCurrentInstance() ;
		remote.deleteArticle(article) ;
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Suppression r�uissite");
		context.addMessage(null, message);
		
		
	}
	
	
	public void doUpdateArticle(ActionEvent actionEvent) {
		
		FacesContext context = FacesContext.getCurrentInstance() ;

		remote.entregisterEntree(article.getCode_Art(), article.getQuantit�()) ;
		remote.updateArticle(article) ;
		
	
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Mise � jour r�uissite");
		context.addMessage(null, message);
		
	}
	
	
	public List<Article> getListArticle() {
		listArticle = remote.getAllArticle() ;
		return listArticle;
	}

	public void setListArticle(List<Article> listArticle) {
		this.listArticle = listArticle;
	}

	public void editEvent(int codeArt) {
        System.out.print(codeArt);
        
        article = remote.readById(codeArt); } 
 
	
	

}
