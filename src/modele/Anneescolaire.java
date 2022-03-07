/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import java.sql.Date;
import java.util.Vector;
import java.sql.*;
/**
 *
 * @author ASUS
 */

public class Anneescolaire extends DB_modele{
	private int id; 
	private String designation; 
	private Date datedebut; 
	private Date datefin;

	// Constructeurs 
	public Anneescolaire(){}
	public Anneescolaire(String d, Date dd, Date df)
	{
		this.designation = d;
		this.datedebut = dd;
		this.datefin = df;
	}
	public Anneescolaire(int i, String d, Date dd, Date df)
	{
		this.id = i;
		this.designation = d;
		this.datedebut = dd;
		this.datefin = df;		
	}

	// Getters
	public int getId() 
	{ return this.id; }
	public String getDesignation()
	{ return this.designation; }
	public Date getDatedebut()
	{ return this.datedebut; }
	public Date getDatefin()
	{ return this.datefin; }
	
	// Setters
	public void setId(int i)
	{ this.id = i; }
	public void setDesignation(String d)
	{ this.designation = d; }
	public void setDatedebut(Date dd)
	{ this.datedebut = dd; }
	public void setDatefin(Date df)
	{ this.datefin = df; }

	// Fonction Anneescolaire[] getListAnneescolaire()

	public void listeAnneescolaire()
	{
		Anneescolaire[] an = getListAnneescolaire();
		for (int i=0; i<an.length; i++) {
			System.out.println(an[i].getDesignation());
			System.out.println(an[i].getId());
			System.out.println(an[i].getDatedebut());
			System.out.println(an[i].getDatefin());
		}
	}
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
