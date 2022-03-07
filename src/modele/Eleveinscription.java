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
public class Eleveinscription extends DB_modele{
	private int id;
	private int ideleve;
	private int idclasse;
	private int idanneescolaire;
	private int idperiode;
	private Date dateinscription;	

	// Constructeurs
	public Eleveinscription(){}
	public Eleveinscription(int ie, int ic, int ia, int ip, Date di)
	{
		this.ideleve = ie;
		this.idclasse = ic;
		this.idanneescolaire = ia;
		this.idperiode = ip;
		this.dateinscription = di;
	}
	public Eleveinscription(int i, int ie, int ic, int ia, int ip, Date di)
	{
		this.id = i;
		this.ideleve = ie;
		this.idclasse = ic;
		this.idanneescolaire = ia;
		this.idperiode = ip;
		this.dateinscription = di;			
	}

	// Getters
	public int getId()
	{ return this.id; }
	public int getIdeleve()
	{ return this.ideleve; }
	public int getIdclasse()
	{ return this.idclasse; }
	public int getIdanneescolaire()
	{ return this.idanneescolaire; }
	public int getIdPeriode()
	{ return this.idperiode; }
	public Date getDateinscription()
	{ return this.dateinscription; }

	// Setters
	public void setId(int i)
	{ this.id = i; }
	public void setIdeleve(int ie)
	{ this.ideleve = ie; }
	public void setIdclasse(int ic)
	{ this.idclasse = ic; }
	public void setIdanneescolaire(int ia)
	{ this.idanneescolaire = ia; }
	public void setIdperiode(int ip)
	{ this.idperiode = ip; }
	public void setDateinscription(Date di)
	{ this.dateinscription = di; }	
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
