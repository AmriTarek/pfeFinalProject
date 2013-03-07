package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Article
 * 
 */
@Entity
public class Article implements Serializable {

	private int code_Art;
	private String ref_Art;
	private String nom_art;
	private String libellé;
	private int prix_HTVA;
	private int TVA;
	private int quantité;
	private int quantité_min;

	private User user;
	private Commande commande;
	private static final long serialVersionUID = 1L;

	public Article() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCode_Art() {
		return this.code_Art;
	}

	public void setCode_Art(int code_Art) {
		this.code_Art = code_Art;
	}

	public Article(String ref_Art, String nom_art, String libellé,
			int prix_HTVA, int tVA, int quantité, int quantité_min) {
		super();
		this.ref_Art = ref_Art;
		this.nom_art = nom_art;
		this.libellé = libellé;
		this.prix_HTVA = prix_HTVA;
		TVA = tVA;
		this.quantité = quantité;
		this.quantité_min = quantité_min;
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

	public String getLibellé() {
		return libellé;
	}

	public void setLibellé(String libellé) {
		this.libellé = libellé;
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

	public Article(String nom_art, String libellé) {
		super();
		this.nom_art = nom_art;
		this.libellé = libellé;
	}

	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	public int getQuantité_min() {
		return quantité_min;
	}

	public void setQuantité_min(int quantité_min) {
		this.quantité_min = quantité_min;
	}

	@ManyToOne
	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
