package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.lang.Long;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: BonLivraison
 *
 */
@Entity

public class BonLivraison implements Serializable {

	
	private int id;
	private int num_bonlivr;
	
	private int quantit�;
	
	
	
	private static final long serialVersionUID = 1L;

	public BonLivraison() {
		super();
	}   
	
	public BonLivraison(int num_bonlivr, int quantit�) {
		super();
		this.num_bonlivr = num_bonlivr;
		this.quantit� = quantit�;
	}

	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)

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
	public int getQuantit�() {
		return this.quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
	
   
}
