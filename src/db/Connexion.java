/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Connexion {
    private Connection cnt;
    private Statement stm;
    private ResultSet res;
    
    // Connexion a la base de donnee POSTGRESQL
    public Connexion(){
        try{ 
            Class.forName("org.postgresql.Driver");
            String user="ecole_manager";
            String password="123456";
            String bdd = "ecole";
            this.cnt=DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+bdd,user,password);
            this.stm=this.cnt.createStatement();

            if(this.cnt==null) System.out.println("non connecte");
            else System.out.println("connecte");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Nop");
        }

    }
    public ResultSet getResultset(){
        return this.res;
    }

    public Connection getConnexion(){return this.cnt;}
    
    public Statement getStatement(){return this.stm;}    

    public static void fermer(Connection cnt){ 
        try{
            cnt.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
