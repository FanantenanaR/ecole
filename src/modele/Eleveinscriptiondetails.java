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
public class Eleveinscriptiondetails extends DB_modele{
	private int id;
	private int ideleve;
	private int idclasse;
	private int idanneescolaire;
	private int idperiode;
	private Date dateinscription;
	private String nomeleve;
	private String prenomeleve;
	private Date datenaissance;
	private Date dateentre;
	private int renvoie;
	private String remarqueeleve;
	private String designationscolaire;
	private Date datedebutscolaire;	
	private Date datefinscolaire;
	private String nomclasse;
	private int niveauclasse;

	// Constructeurs
	public Eleveinscriptiondetails(){}
	public Eleveinscriptiondetails(int i, int ie, int ic, int ia, int ip, Date di, String ne, String pe, Date dn, Date de, int re, String rel, String ds, Date dds, Date dfs, String nc, int nic)
	{
		this.id = i;
		this.ideleve = ie;
		this.idclasse = ic;
		this.idanneescolaire = ia;
		this.idperiode = ip;
		this.dateinscription = di;
		this.nomeleve = ne;
		this.prenomeleve = pe;
		this.datenaissance = dn;
		this.dateentre = de; 
		this.renvoie = re;
		this.remarqueeleve = rel;
		this.designationscolaire = ds;
		this.datedebutscolaire = dds;
		this.datefinscolaire = dfs;
		this.nomclasse = nc;
		this.niveauclasse = nic;
	}
	public Eleveinscriptiondetails(int ie, int ic, int ia, int ip, Date di, String ne, String pe, Date dn, Date de, int re, String rel, String ds, Date dds, Date dfs, String nc, int nic)
	{
		this.ideleve = ie;
		this.idclasse = ic;
		this.idanneescolaire = ia;
		this.idperiode = ip;
		this.dateinscription = di;
		this.nomeleve = ne;
		this.prenomeleve = pe;
		this.datenaissance = dn;
		this.dateentre = de; 
		this.renvoie = re;
		this.remarqueeleve = rel;
		this.designationscolaire = ds;
		this.datedebutscolaire = dds;
		this.datefinscolaire = dfs;
		this.nomclasse = nc;
		this.niveauclasse = nic;		
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
	public int getIdperiode()
	{ return this.idperiode; }
	public Date getDateinscription()
	{ return this.dateinscription; }
	public String getNomeleve()
	{ return this.nomeleve; }
	public String getPrenomeleve()
	{ return this.prenomeleve; }
	public Date getDatenaissance()
	{ return this.datenaissance; }
	public Date getDateentre()
	{ return this.dateentre; }
	public int getRenvoie()
	{ return this.renvoie; }
	public String getRemarqueeleve()
	{ return this.remarqueeleve; }
	public String getDesignationscolaire()
	{ return this.designationscolaire; }
	public Date getDatedebutscolaire()
	{ return this.datedebutscolaire; }
	public Date getDatefinscolaire()
	{ return this.datefinscolaire; }
	public String getNomclasse()
	{ return this.nomclasse; }
	public int getNiveauclasse()
	{ return this.niveauclasse; }

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
	public void setNomeleve(String ne)
	{ this.nomeleve = ne; }
	public void setPrenomeleve(String pe)
	{ this.prenomeleve = pe; }
	public void setDatenaissance(Date dn)
	{ this.datenaissance = dn; }
	public void setDateentre(Date de)
	{ this.dateentre = de; }
	public void setRenvoie(int re)
	{ this.renvoie = re; }
	public void setRemarqueeleve(String rel)
	{ this.remarqueeleve = rel; }
	public void setDesignationscolaire(String ds)
	{ this.designationscolaire = ds; }
	public void setDatedebutscolaire(Date dds)
	{ this.datedebutscolaire = dds; }
	public void setDatefinscolaire(Date dfs)
	{ this.datefinscolaire = dfs; }
	public void setNomclasse(String nc)
	{ this.nomclasse = nc; }
	public void setNiveauclasse(int nic)
	{ this.niveauclasse = nic; }

	public void listeEleveIDetails(int idclasse)
	{
		Eleveinscriptiondetails[] eid = getListEleve(idclasse);
		for (int i = 0; i < eid.length; i++) {
				System.out.println("Id : "+eid[i].getId());
				System.out.println("ideleve : "+eid[i].getIdeleve());
				System.out.println("idclasse : "+eid[i].getIdclasse());
				System.out.println("idanneescolaire : "+eid[i].getIdanneescolaire());
				System.out.println("idperiode : "+eid[i].getIdperiode());
				System.out.println("dateinscription : "+eid[i].getDateinscription());
				System.out.println("nomeleve : "+eid[i].getNomeleve());
				System.out.println("prenomeleve : "+eid[i].getPrenomeleve());
				System.out.println("datenaissance : "+eid[i].getDatenaissance());
				System.out.println("dateentre : "+eid[i].getDateentre());
				System.out.println("renvoie : "+eid[i].getRenvoie());
				System.out.println("remarqueeleve : "+eid[i].getRemarqueeleve());
				System.out.println("designationscolaire : "+eid[i].getDesignationscolaire());
				System.out.println("datedebutscolaire : "+eid[i].getDatedebutscolaire());
				System.out.println("datefinscolaire : "+eid[i].getDatefinscolaire());
				System.out.println("nomclasse : "+eid[i].getNomclasse());
				System.out.println("niveauclasse : "+eid[i].getNiveauclasse());	
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
}
