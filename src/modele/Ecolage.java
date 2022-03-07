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
public class Ecolage extends DB_modele{
	private int id;
	private double montant;
	private int idanneescolaire;
	private int idclasse;

	// Constructeurs 
	public Ecolage(){}
	public Ecolage(double m, int ia, int ic)
	{
		this.montant = m;
		this.idanneescolaire = ia;
		this.idclasse = ic;
	} 
	public Ecolage(int i, double m, int ia, int ic)
	{
		this.id = i;
		this.montant = m;
		this.idanneescolaire = ia;
		this.idclasse = ic;		
	}

	// Getters
	public int getId()
	{ return this.id; }
	public double getMontant()
	{ return this.montant; }
	public int getIdAnneescolaire()
	{ return this.idanneescolaire; }
	public int getIdclasse()
	{ return this.idclasse; }

	// Setters
	public void setId(int i)
	{ this.id = i; }
	public void setMontant(double m)
	{ this.montant = m; }
	public void setIdAnneescolaire(int ia)
	{ this.idanneescolaire = ia; }
	public void setIdclasse(int ic)
	{ this.idclasse = ic; }
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
