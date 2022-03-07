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
public class Periode extends DB_modele{
	private int id; 
	private String designation;
	private Date datedebut;
	private Date datefin;
	private int idanneescolaire;

	// Constructeurs 
	public Periode(){}
	public Periode(String d, Date dd, Date df, int ia)
	{
		this.designation = d;
		this.datedebut = dd;
		this.datefin = df;
		this.idanneescolaire = ia;
	} 
	public Periode(int i, String d, Date dd, Date df, int ia)
	{
		this.id = i;
		this.designation = d;
		this.datedebut = dd;
		this.datefin = df;
		this.idanneescolaire = ia;		
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
	public int getIdAnneescolaire()
	{ return this.idanneescolaire; }

	// Setters
	public void setId(int i)
	{ this.id = i; }
	public void setDesignation(String d)
	{ this.designation = d; }
	public void setDatedebut(Date dd)
	{ this.datedebut = dd; }
	public void setDatefin(Date df)
	{ this.datefin = df; }
	public void setIdAnneescolaire(int ia)
	{ this.idanneescolaire = ia; }
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
