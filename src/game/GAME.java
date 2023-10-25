/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.controler.AbstractControler;
import game.controler.Controler;
import game.model.AbstractModel;
import game.model.Joueur;
import game.model.Plateau;
import game.vue.Vue;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class GAME {
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plateau model = new Plateau(19,19); 
        Controler controler = new Controler(model);
        Vue v = new Vue(model,controler);
        model.addObservateur(v);
        v.setVisible(true);
        while(model.partieTerminer()){
            controler.calculerStepSuivant();
        }
        
    	/*
    	 *  Informations de connexion, pour connecter l'application
    	 *  à la BDD
    	 */
    	String url = "jdbc:mysql://localhost:8889/MancheRisk";
    	String jdbc = "org.mysql.jdbc.Driver";
    	String user = "root";
    	String password = "root";
    	
    	/*
    	 *  On vérifie bien que la connexion avec la base de données
    	 *  s'effectue sans aucun problème.
    	 */
    	try {
    	    Class.forName("com.mysql.cj.jdbc.Driver");
    	    Connection conn = DriverManager.getConnection(url, user, password);
    	    System.out.println("Connecter");
    	    Statement stmt = conn.createStatement();
            String sql = "Select * from Joueur";
            ResultSet resultSet = stmt.executeQuery(sql);
            
            while(resultSet.next()){
                int idJoueur = resultSet.getInt("idJoueur");
                String nomJoueur  = resultSet.getString("nomJoueur");
                String prenomJoueur = resultSet.getString("prenomJoueur");
                String numInscriptionJoueur = resultSet.getString("numInscriptionJoueur");
                Joueur joueurBD = new Joueur(nomJoueur,prenomJoueur);
                System.out.println(joueurBD.getNomJoueur());
            }
            
            /*
        	 *  Fermer les connexions ouvertes de la BD.
        	 *  
        	 */
            resultSet.close();
            stmt.close();
            conn.close();
            
    	} catch (Exception e){
    	    e.printStackTrace();
    	    System.out.println("Erreur");
    	    System.exit(0);
    	}
    }
}
