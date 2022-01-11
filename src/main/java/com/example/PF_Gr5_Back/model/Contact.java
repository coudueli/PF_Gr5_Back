package com.example.PF_Gr5_Back.model;

public class Contact {
//	-	Contact (nom – prenom - mail)
	private String nom;
	private String prenom;
	private String mail;
	
	public Contact() {
	}

	public Contact(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + "]";
	}
	
}
