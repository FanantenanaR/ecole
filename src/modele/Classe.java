/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author ASUS
 */
public class Classe extends DB_modele {
	private int id;
	private String nom;
	private int niveau;

	// Constructeurs
	public Classe(){}
	public Classe(String n, int ni)
	{
		this.nom = n;
		this.niveau = ni;
	} 
	public Classe(int i, String n, int ni)
	{
		this.id = i;
		this.nom = n;
		this.niveau = ni;
	}

	// Getters
	public int getId()
	{ return this.id; }
	public String getNom()
	{ return this.nom; }
	public int getNiveau()
	{ return this.niveau; }

	// Setters
	public void setId(int i)
	{ this.id = i; }
	public void setNom(String n)
	{ this.nom = n; }
	public void setNiveau(int ni)
	{ this.niveau = ni; }
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
