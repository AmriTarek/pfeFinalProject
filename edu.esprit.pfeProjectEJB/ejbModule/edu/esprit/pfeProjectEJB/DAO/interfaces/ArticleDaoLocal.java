package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.pfeProjectEJB.persistence.Article;

@Local
public interface ArticleDaoLocal {
	public void createArticle(Article article) ;
	public void updateArticle(Article article) ;
	public void deleteArticle(Article article) ;
	public Article readById(int codeArt) ;
	public List<Article> getAllArticle() ;
	public void entregisterEntree(int id_art, int quant) ;
	}
