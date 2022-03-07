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
public class Ecolageclasseanneedetails extends DB_modele{
	private int idecolage;
	private double montant;
	private int idanneescolaire;
	private int idclasse;
	private String nomclasse;
	private int niveauclasse;
	private String anneedesignation;
	private Date datededebutscolaire;
	private Date datefinscolaire;

	public Ecolageclasseanneedetails(){}

	public Ecolageclasseanneedetails(int ie, double m, int ia, int ic, String nc, int ncl, String ad, Date dbs, Date dfs)
	{
		this.idecolage = ie;
		this.montant = m;
		this.idanneescolaire = ia;
		this.idclasse = ic;
		this.nomclasse = nc;
		this.niveauclasse = ncl;
		this.anneedesignation = ad;
		this.datededebutscolaire = dbs;
		this.datefinscolaire = dfs;
	}

	// Getters
	public int getIdecolage()
	{ return this.idecolage; }
	public double getMontant()
	{ return this.montant; }
	public int getIdanneescolaire()
	{ return this.idanneescolaire; }
	public int getIdclasse()
	{ return this.idclasse; }
	public String getNomclasse()
	{ return this.nomclasse; }
	public int getNiveauclasse()
	{ return this.niveauclasse; }
	public String getAnneedesignation()
	{ return this.anneedesignation; }
	public Date getDatededebutscolaire()
	{ return this.datededebutscolaire; }
	public Date getDatefinscolaire()
	{ return this.datefinscolaire; }

	// Setters
	public void setIdecolage(int ie)
	{ this.idecolage = ie; }
	public void setMontant(double m)
	{ this.montant = m; }
	public void setIdanneescolaire(int ia)
	{ this.idanneescolaire = ia; }
	public void setIdclasse(int ic)
	{ this.idclasse = ic; }
	public void setNomclasse(String nc)
	{ this.nomclasse = nc; }
	public void setNiveauclasse(int nic)
	{ this.niveauclasse = nic; }
	public void setAnneedesignation(String ad)
	{ this.anneedesignation = ad; }
	public void setDatededebutscolaire(Date dds)
	{ this.datededebutscolaire = dds; }
	public void setDatefinscolaire(Date dfs)
	{ this.datefinscolaire = dfs; }

	public void ListeClasse(int idclasse)
	{
		Ecolageclasseanneedetails[] cla = getListClasse(idclasse);
		for (int i = 0; i<cla.length; i++) {
				System.out.println(cla[i].getIdclasse());
				System.out.println(cla[i].getNomclasse());
				System.out.println(cla[i].getNiveauclasse());
			}		
	}
	// delete
	public void effacer(int id)
	{
		delete(/*this*/ id);
	}
	// update
	public void changer(int id)
	{
		update(/*this,*/ id);
	}		    
}
