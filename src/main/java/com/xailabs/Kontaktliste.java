package com.xailabs;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "kontaktliste")
public class Kontaktliste {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@OneToMany(mappedBy = "kontakt")
	private List<Telefonnummer> telefonbuch;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "kontaktliste_kontaktarten", joinColumns = {
			@JoinColumn(name = "kontaktliste_id", referencedColumnName = "Id") }, inverseJoinColumns = {
					@JoinColumn(name = "kontaktarten_id", referencedColumnName = "Id") })
	private List<Kontaktart> kontaktarten;

	@Column(name = "name")
	private String name;

	@Column(name = "nachname")
	private String nachname;

	@Column(name = "straße")
	private String straße;

	@Column(name = "straßennummer")
	private String straßenNummer;

	@Column(name = "plz")
	private String plz;

	@Column(name = "ort")
	private String ort;

	@Column(name = "land")
	private String land;

	@Column(name = "geburtsdatum")
	private Date geburtsdatum;

	@Column(name = "geschlecht")
	private String geschlecht;

	@Column(name = "email")
	private String email;
	
	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachName() {
		return nachname;
	}

	public void setNachName(String nachname) {
		this.nachname = nachname;

	}

	public String getStraße() {
		return straße;
	}

	public void setStraße(String straße) {
		this.straße = straße;
	}

	public String getStraßenNummer() {
		return straßenNummer;
	}

	public void setStraßenNummer(String straßenNummer) {
		this.straßenNummer = straßenNummer;

	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public Date getGeburtsDatum() {
		return geburtsdatum;
	}

	public void setGeburtsDatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setKontaktarten(List<Kontaktart> kontaktarten) {
		this.kontaktarten = kontaktarten;
	}

	public List<Kontaktart> getKontaktarten() {
		return kontaktarten;
	}

}