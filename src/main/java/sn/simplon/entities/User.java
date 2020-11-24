package sn.simplon.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private int etat;
	

	
	@ManyToMany(fetch=FetchType.LAZY , cascade=CascadeType.ALL)
	@JoinTable(name="user_roles" , 
			joinColumns = {@JoinColumn(name="idU",nullable=false,updatable =false)},
			inverseJoinColumns = {@JoinColumn(name="idR",nullable= false , updatable =false)})
	private List<Roles> roles = new ArrayList<Roles>();



	public User() {
		super();
	}



	public User(int id, String nom, String prenom, String password, String email, int etat, List<Roles> roles) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.email = email;
		this.etat = etat;
		this.roles = roles;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getEtat() {
		return etat;
	}



	public void setEtat(int etat) {
		this.etat = etat;
	}



	public List<Roles> getRoles() {
		return roles;
	}



	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}



	
	


}
