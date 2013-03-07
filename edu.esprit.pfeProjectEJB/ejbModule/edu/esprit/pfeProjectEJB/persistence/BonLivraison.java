package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BonLivraison
 *
 */
@Entity

public class BonLivraison implements Serializable {

	
	private int id;
	private int num_bonlivr;
	private int quantité;
	
	
	private static final long serialVersionUID = 1L;

	public BonLivraison() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getNum_bonlivr() {
		return this.num_bonlivr;
	}

	public void setNum_bonlivr(int num_bonlivr) {
		this.num_bonlivr = num_bonlivr;
	}   
	public int getQuantité() {
		return this.quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
   
}
