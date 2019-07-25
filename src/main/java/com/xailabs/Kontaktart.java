package com.xailabs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query = "Select e from Kontaktart e ", name = "kontaktarten")
@javax.persistence.Table(name = "kontaktarten")
public class Kontaktart {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "beziehungen")
	private String beziehungen;

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBeziehungen() {
		return beziehungen;
	}

	public void setBeziehungen(String beziehungen) {
		this.beziehungen = beziehungen;
	}

}
