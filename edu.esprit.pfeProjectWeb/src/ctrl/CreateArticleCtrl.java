package ctrl;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.persistence.Article;

@ManagedBean
@SessionScoped
public class CreateArticleCtrl {
	private Article article = new Article();
	@EJB
	ArticleDaoRemote remote;

	public String doAddArticle() {
		FacesContext context=FacesContext.getCurrentInstance();
try { 
		remote.createArticle(article);
		article= new Article();
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Création réuissite");
		context.addMessage(null, message);
}catch(Exception e){

			FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erreur","Erreur de création");
			context.addMessage(null, message);
}
		return "";
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
