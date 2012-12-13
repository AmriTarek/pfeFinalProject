package edu.esprit.pfeProjectEJB.domain.management.interfaces;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.pfeProjectEJB.persistence.Article;

@Local
public interface ArticleDaoLocal {
	public void createArticle(Article article) ;
	public void updateArticle(Article article) ;
	public void deleteArticle(Article article) ;
	public Article getArticleById(int codeArt) ;
	public List<Article> getAllArticle() ;

}
