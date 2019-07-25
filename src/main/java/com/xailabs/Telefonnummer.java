package com.xailabs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.xailabs.Kontaktliste;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "telefonnumer")

public class Telefonnummer {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kontakt_id")
	private Kontaktliste kontakt;

	@Id
	@Column(name = "Nr")
	private String nr;
	@Column(name = "private")
	private boolean isPrivate;

	@Column(name = "handy")
	private boolean handy;

	public Kontaktliste getKontakt() {
		return kontakt;
	}

	public void setKontaktId(Kontaktliste kontakt) {
		this.kontakt = kontakt;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public boolean getHandy() {
		return handy;
	}

	public void setHandy(boolean handy) {
		this.handy = handy;
	}
}
