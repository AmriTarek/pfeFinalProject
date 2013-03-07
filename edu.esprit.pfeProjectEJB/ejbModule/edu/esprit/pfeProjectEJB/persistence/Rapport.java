package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rapport
 *
 */
@Entity

public class Rapport implements Serializable {

	
	private int id;
	private Date date;
	private static final long serialVersionUID = 1L;

	public Rapport() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
   
}
