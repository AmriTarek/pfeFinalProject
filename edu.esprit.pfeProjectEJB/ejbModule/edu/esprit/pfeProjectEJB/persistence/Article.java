package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Article
 * 
 */
@Entity
public class Article implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code_Art;
	private String ref_Art;
	private String nom_art;
	private String libelle;
	private int prix_HTVA;
	private int TVA;
	private int quantit�;
	public Collection<Mouvement> getLismouvement() {
		return lismouvement;
	}


	public void setLismouvement(Collection<Mouvement> lismouvement) {
		this.lismouvement = lismouvement;
	}
	private int quantit�_min;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL, mappedBy="article")
	private Collection<Mouvement> lismouvement ;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private Commande commande;
	
	
	private static final long serialVersionUID = 1L ;

	public Article() {
		super();
	}

	
	public int getCode_Art() {
		return this.code_Art;
	}

	public void setCode_Art(int code_Art) {
		this.code_Art = code_Art;
	}

	public Article(String ref_Art, String nom_art, String libell�,
			int prix_HTVA, int tVA, int quantit�, int quantit�_min) {
		super();
		this.ref_Art = ref_Art;
		this.nom_art = nom_art;
		this.libelle = libell�;
		this.prix_HTVA = prix_HTVA;
		TVA = tVA;
		this.quantit� = quantit�;
		this.quantit�_min = quantit�_min;
	}

	

	public String getRef_Art() {
		return ref_Art;
	}

	public void setRef_Art(String ref_Art) {
		this.ref_Art = ref_Art;
	}

	public String getNom_art() {
		return nom_art;
	}

	public void setNom_art(String nom_art) {
		this.nom_art = nom_art;
	}

	public String getLibell�() {
		return libelle;
	}

	public void setLibell�(String libell�) {
		this.libelle = libell�;
	}

	public int getPrix_HTVA() {
		return prix_HTVA;
	}

	public void setPrix_HTVA(int prix_HTVA) {
		this.prix_HTVA = prix_HTVA;
	}

	public int getTVA() {
		return TVA;
	}

	public void setTVA(int tVA) {
		TVA = tVA;
	}

	public Article(String nom_art, String libell�) {
		super();
		this.nom_art = nom_art;
		this.libelle = libell�;
	}

	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}

	public int getQuantit�_min() {
		return quantit�_min;
	}

	public void setQuantit�_min(int quantit�_min) {
		this.quantit�_min = quantit�_min;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
   



}
