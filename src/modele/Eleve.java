/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import java.sql.Date;
/**
 *
 * @author ASUS
 */
public class Eleve extends DB_modele{
	private int id;
	private String nom;
	private String prenom;
	private Date datenaissance;
	private Date dateentre;
	private int renvoie;
	private String remarque;

	// Constructeurs
	public Eleve(){}
	public Eleve(String n, String p, Date dn, Date de, int r, String re)
	{
		this.nom = n;
		this.prenom = p;
		this.datenaissance = dn;
		this.dateentre = de;
		this.renvoie = r;
		this.remarque = re;
	}
	public Eleve(int i, String n, String p, Date dn, Date de, int r, String re)
	{
		this.id = i;
		this.nom = n;
		this.prenom = p;
		this.datenaissance = dn;
		this.dateentre = de;
		this.renvoie = r;
		this.remarque = re;		
	}

	// Getters
	public int getId()
	{ return this.id; }
	public String getNom()
	{ return this.nom; }
	public String getPrenom()
	{ return this.prenom; }
	public Date getDatenaissance()
	{ return this.datenaissance; }
	public Date getDateentree()
	{ return this.dateentre; }
	public int getRenvoie()
	{ return this.renvoie; }
	public String getRemarque()
	{ return this.remarque; }

	// Setters
	public void setId(int i)
	{ this.id = i; }
	public void setNom(String n)
	{ this.nom = n; }
	public void setPrenom(String p)
	{ this.prenom = p; }
	public void setDatenaissance(Date dn)
	{ this.datenaissance = dn; }
	public void setDateentree(Date de)
	{ this.dateentre = de; }
	public void setRenvoie(int r)
	{ this.renvoie = r; }
	public void setRemarque(String re)
	{ this.remarque = re; }
	// delete
	public void effacer(int id)
	{
		delete(id);
	}
	// update
	public void changer(int id)
	{
		update(id);
	}
	// insert
	public void inserer()
	{
		inserte();
	}    
}
