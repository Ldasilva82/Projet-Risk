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
 * @author alex, ravaka, pauline, lucas, yaning
 */
public class GAME {

    /**
     * exécution du plateau
     */
    public static void main(String[] args) {
        Plateau model = new Plateau(19,19); 
        Controler controler = new Controler(model);
        Vue v = new Vue(model,controler);
        model.addObservateur(v);
        v.setVisible(true);
        
    	/**
    	 *  Informations de connexion, pour connecter l'application
    	 *  à la BDD
    	 */
    	String url = "jdbc:mysql://localhost:8889/MancheRisk";
    	String jdbc = "org.mysql.jdbc.Driver";
    	String user = "root";
    	String password = "root";
    	int numPartie = 2;
    	
    	/*
    	 *  On vérifie bien que la connexion avec la base de données s'effectue sans aucun problème.
    	 *  s'effectue sans aucun problème.
    	 */
    	try {
    	    Class.forName("com.mysql.cj.jdbc.Driver");
    	    Connection connexion = DriverManager.getConnection(url, user, password);
    	    System.out.println("Connexion établie avec la BD");
    	    
    	    //Requête pour afficher les joueurs affectés à la partie 
    	    System.out.println("-----Liste des cinq joueurs de la partie-----");
    	    Statement stmt = connexion.createStatement();
            String sqlJoueur = "SELECT * FROM Joueur, Participer WHERE Joueur.idJoueur = Participer.idJoueur AND Participer.idPartie = " + numPartie;
            ResultSet resultSet = stmt.executeQuery(sqlJoueur);
            
            while(resultSet.next()){
                int idJoueur = resultSet.getInt("idJoueur");
                String nomJoueur  = resultSet.getString("nomJoueur");
                String prenomJoueur = resultSet.getString("prenomJoueur");
                String numInscriptionJoueur = resultSet.getString("numInscriptionJoueur");
                Joueur joueurBD = new Joueur(nomJoueur,prenomJoueur);
                System.out.println(joueurBD.getNomJoueur().toUpperCase() + " " + joueurBD.getPrenomJoueur());
                model.getOrdreJoueur().add(joueurBD);    
            }
            
            //Afficher l'ordre des joueurs
            
//        	while(model.partieTerminer()){
//            	System.out.println("yes");
//                controler.calculerStepSuivant();
//            }
        	
            System.out.println("-----Liste ordre des joueurs-----");
            for (Joueur joueur : model.getOrdreJoueur()) {
            	System.out.println(joueur.getNomJoueur().toUpperCase() + " " + joueur.getPrenomJoueur());
            	}
            
            /**
        	 *  Fermer les connexions ouvertes de la BD.
        	 *  
        	 */
            resultSet.close();
            stmt.close();
            connexion.close();
            
    	} catch (Exception excep){
    	    excep.printStackTrace();
    	    System.out.println("Erreur connexion BD");
    	    System.exit(0);
    	}
    	
    }
}
