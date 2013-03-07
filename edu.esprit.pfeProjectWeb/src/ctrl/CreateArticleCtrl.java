package ctrl;

import java.util.Properties;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.persistence.Article;

@ManagedBean
@SessionScoped

public class CreateArticleCtrl {
	private Article article = new Article();
	ArticleDaoRemote remote ;
	
	public String doCreateArticle()
	{
		getProxy() ;
		remote.createArticle(article) ;
		return "" ;
		
	}
	
	public void getProxy()
	{
		Properties properties=new Properties();
		properties.put("java.naming.factory.url.pkgs", "org.jboss.ejb.client.naming") ;
		properties.put("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		properties.put("java.naming.provider.url", "remote://localhost:4447");
		properties.put("jboss.naming.client.ejb.context", true);
		properties.put("jboss.naming.client.connect.options.org.xnio.Options.SASL_POLICY_NOPLAINTEXT", false);
		
		try {
			Context context =new InitialContext(properties) ;
			remote=(ArticleDaoRemote) context.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/ArticleDao!edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	

}
