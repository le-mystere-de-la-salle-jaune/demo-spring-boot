package dev.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Employe {

	@NotEmpty
	private String nom;

	@Size(min = 2)
	private String prenom;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
