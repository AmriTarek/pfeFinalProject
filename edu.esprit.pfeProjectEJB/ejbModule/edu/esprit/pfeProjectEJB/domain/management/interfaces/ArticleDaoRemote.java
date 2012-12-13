package edu.esprit.pfeProjectEJB.domain.management.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.Article;

@Remote
public interface ArticleDaoRemote {
	
	public void createArticle(Article article) ;
	public void updateArticle(Article article) ;
	public void deleteArticle(Article article) ;
	public Article getArticleById(int codeArt) ;
	public List<Article> getAllArticle() ;

}
