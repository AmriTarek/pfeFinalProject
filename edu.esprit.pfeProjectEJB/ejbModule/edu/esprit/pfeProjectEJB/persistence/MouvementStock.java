package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: MouvementStock
 *
 */
@Entity

public class MouvementStock implements Serializable {

	private int id ;
	private Date date ;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}

	private int quantit� ;
	
	private static final long serialVersionUID = 1L;

	public MouvementStock() {
		super();
	}
   
}
