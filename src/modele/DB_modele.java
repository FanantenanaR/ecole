/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import db.Connexion;
import java.lang.reflect.*;
import java.util.Vector;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class DB_modele {
    private Connection cnt;
    private Statement stm;
    private ResultSet res;
    /*Liste des fonctions a faire :
    	- Anneescolaire[] getListAnneescolaire()
    	- Classe[] getListClasse(int idanneescolaire)
    	- Eleveinscriptiondetails[] getListEleve(int idclasse)
    	*/	
    
    public Anneescolaire[] getListAnneescolaire()
    {
        String sql = "SELECT * FROM anneescolaire";
        Vector<Anneescolaire> v = new Vector();
        Connexion con = new Connexion();
        Statement stat = con.getStatement();
        try
        {
            stat = con.getConnexion().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next())
            {
                Anneescolaire as = new Anneescolaire();
                as.setDesignation(res.getString("designation"));
                as.setId(res.getInt("id"));
                as.setDatedebut(res.getDate("datedebut"));
                as.setDatefin(res.getDate("datefin"));
                v.add(as);
            }
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //cnt.close();
        Anneescolaire[] an = new Anneescolaire[v.size()];
        for (int i=0; i<an.length; i++) {
            an[i] = v.get(i);
        }
        return an;
    }

    //SELECT idclasse as id, nomclasse as nom, niveauclasse as niveau from ecolageclasseanneedetails;
    public Ecolageclasseanneedetails[] getListClasse(int idanneescolaire)
    {
        String sql = "SELECT idclasse as id, nomclasse as nom, niveauclasse as niveau FROM ecolageclasseanneedetails WHERE idanneescolaire = "+idanneescolaire;
        Vector<Ecolageclasseanneedetails> v = new Vector();
        Connexion con = new Connexion();
        Statement stat = con.getStatement();
        try
        {
            stat = con.getConnexion().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next())
            {
                Ecolageclasseanneedetails cl = new Ecolageclasseanneedetails();
                cl.setIdclasse(res.getInt("id"));
                cl.setNomclasse(res.getString("nom"));        
                cl.setNiveauclasse(res.getInt("niveau"));
                v.add(cl);
            }
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //cnt.close();
        Ecolageclasseanneedetails[] ecad = new Ecolageclasseanneedetails[v.size()];
        for (int i=0; i<ecad.length; i++) {
            ecad[i] = v.get(i);
        }
        return ecad;
    }

    public Eleveinscriptiondetails[] getListEleve(int idclasse)
    {
        String sql = "SELECT * FROM Eleveinscriptiondetails WHERE idclasse = "+idclasse;
        Vector<Eleveinscriptiondetails> v = new Vector();
        Connexion con = new Connexion();
        Statement stat = con.getStatement();
        try
        {
            stat = con.getConnexion().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next())
            {
                Eleveinscriptiondetails cli = new Eleveinscriptiondetails();
                cli.setId(res.getInt("id"));
                cli.setIdeleve(res.getInt("ideleve"));        
                cli.setIdclasse(res.getInt("idclasse"));
                cli.setIdanneescolaire(res.getInt("idanneescolaire"));
                cli.setIdperiode(res.getInt("idperiode"));
                cli.setDateinscription(res.getDate("dateinscription"));
                cli.setNomeleve(res.getString("nomeleve"));
                cli.setPrenomeleve(res.getString("prenomeleve"));
                cli.setDatenaissance(res.getDate("datenaissance"));
                cli.setDateentre(res.getDate("dateentre"));
                cli.setRenvoie(res.getInt("renvoie"));
                cli.setRemarqueeleve(res.getString("remarqueeleve"));
                cli.setDesignationscolaire(res.getString("designationscolaire"));
                cli.setDatedebutscolaire(res.getDate("datededebutscolaire"));
                cli.setDatefinscolaire(res.getDate("datefinscolaire"));
                cli.setNomclasse(res.getString("nomclasse"));
                cli.setNiveauclasse(res.getInt("niveauclasse"));
                v.add(cli);
            }
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //cnt.close();
        Eleveinscriptiondetails[] eid = new Eleveinscriptiondetails[v.size()];
        for (int i=0; i<eid.length; i++) {
            eid[i] = v.get(i);
        }
        return eid;        
    }
    // Update generalisee
    public void update(int id)
    {
        Class c = this.getClass();
        String table = c.getSimpleName();
        StringBuilder sql = new StringBuilder("UPDATE "+ table + " SET ");
        for(Field attribut : c.getDeclaredFields()){
            try{
                attribut.setAccessible(true);
                String name=attribut.getName();
                Object value=attribut.get(this);
                if(value!=null){
                    if((value instanceof String) || (value instanceof Number)){
                        if(!(value instanceof Number)){
                            sql.append(name+"='"+value.toString()+"'"+",");
                        }
                        else{
                            sql.append(name+"="+value.toString()+",");
                        }
                    }
                }
            }
            catch(Exception e){}
        }
        int e = sql.lastIndexOf(",");
        sql.deleteCharAt(e);
        sql.append(" WHERE id = "+id);
        System.out.println(sql);
        try{
            Connexion con = new Connexion();
            Statement stmt = con.getStatement();
            int x = stmt.executeUpdate(sql.toString());
            con.fermer(con.getConnexion());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    // Delete generalisee
    public void delete(int id)
    {
        Class c = this.getClass();
        String table = c.getSimpleName();
        String sql = "DELETE FROM "+table+" WHERE id ="+id;
        try{
            Connexion con = new Connexion();
            Statement stmt = con.getStatement();
            int x = stmt.executeUpdate(sql);
            con.fermer(con.getConnexion());
            System.out.println("fini");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    // INSERT GENERALISEE
    public void inserte(/*Inserable o,String table,Connection c*/){
        Class c = this.getClass();
        String table = c.getSimpleName();
        String insert="INSERT INTO "+table+"(";
        StringBuilder sql = new StringBuilder(insert);
        Field[] ch = c.getDeclaredFields();
        for (int i= 0; i<ch.length;i++ ) {
            System.out.println(ch[i].getName());
        }
        if (ch.length < 2) {
            sql.append(ch[1].getName());   
        System.out.println(sql);
        }
        else
        {
            for (int i = 1; i<ch.length; i++) {
                sql.append(ch[i].getName()+",");
            }
            int e = sql.lastIndexOf(",");
            sql.deleteCharAt(e);    
        }
        sql.append(") VALUES (");                    
        for(Field attribut : c.getDeclaredFields()){
            try{
                if (!(attribut.equals(c.getDeclaredField("id")))) {                 
                        attribut.setAccessible(true);
                        String name=attribut.getName();
                        Object value=attribut.get(this);
                        if(value!=null){
                            if((value instanceof String) || (value instanceof Number) || (value instanceof Date)){
                                if(!(value instanceof Number)){
                                    sql.append("'"+value.toString()+"'");
                                    sql.append(",");
                                }
                                else{
                                    if(Double.parseDouble(value.toString())>=0){
                                        sql.append(value.toString());
                                        sql.append(",");
                                    }
                                }
                            }
                        }
                }        
            }
            catch (Exception e) {
                
            }
        }
        int u = sql.lastIndexOf(",");
        sql.deleteCharAt(u);
        sql.append(")");
        System.out.println(sql);
        try{
            Connexion con = new Connexion();
            Statement stmt = con.getStatement();
            int x = stmt.executeUpdate(sql.toString());
            con.fermer(con.getConnexion());
        }
        catch(Exception ef){
            System.out.println(ef);
        }
    }     
}
