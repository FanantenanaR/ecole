/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import db.Connexion;
import modele.*;
import java.util.Arrays;
import java.sql.Date;
/**
 *
 * @author ASUS
 */
public class Test {
	public static void main(String[] args) {
		//Connexion con = new Connexion();
		//Classe cl = new Classe("Classe1",5);
		//Anneescolaire a = new Anneescolaire();
		Date o = Date.valueOf("2024-11-10");
		Date d = Date.valueOf("2025-08-20");
		System.out.println(o);

		Anneescolaire b = new Anneescolaire("anneescolaire2024",o,d);
		//Eleveinscriptiondetails eid = new Eleveinscriptiondetails();
                //eid.listeEleveIDetails(1);
		// Test de la fonction delete
		//a.effacer(2);
		//Eleve e = new Eleve();
		//e.setNom("RANDRIANAMPARINA");
		//a.setId(2);
		//a.changer(5);
		//a.listeAnneescolaire();
		//b.inserer();
		//cl.inserer();
                //Ecolageclasseanneedetails ecd = new Ecolageclasseanneedetails();
                //ecd.ListeClasse(1);
                Anneescolaire an = new Anneescolaire();
                an.listeAnneescolaire();
        }
}
