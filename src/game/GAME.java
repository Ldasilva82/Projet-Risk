/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import game.controler.AbstractControler;
import game.controler.Controler;
import game.model.AbstractModel;
import game.model.Joueur;
import game.model.Plateau;
import game.vue.Vue;

/**
 * @author Lucas Pauline Yaning Alex Ravaka (david)
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
        int nbPartie = 1;
        
        String DB_URL = "jdbc:mysql://localhost:3306/manche_risk";
        //Compte accédant à la base de données
        String USER = "root";
        String PWD = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PWD); 
            System.out.println("Connecté correctement à la Base");
            Statement stmt = conn.createStatement();
            String sql = "Select * from joueur, participer Where joueur.IDinscription = participer.IDinscription And participer.IDPartie = " + nbPartie;
            ResultSet resultSet = stmt.executeQuery(sql);

            System.out.println("=========Liste des Joueurs=========");
            while(resultSet.next()){
                int idInscription = resultSet.getInt("IDinscription");
                String nomJoueur  = resultSet.getString("NomJoueur");
                String prenomJoueur = resultSet.getString("PrenomJoueur");
                Joueur joueurBD = new Joueur(nomJoueur,prenomJoueur);
                joueurBD.setNumInscription(idInscription);
                model.getOrdreJoueur().add(joueurBD);
                System.out.println("Affectation des joueurs effectuée");
            }
            
            while(model.partieTerminer()){
            	System.out.println("yes");
                controler.calculerStepSuivant();
            }
            
            Timestamp finPartie = new Timestamp(System.currentTimeMillis());
            
            for (Joueur joueur : model.getOrdreJoueur()) {
            	sql = "UPDATE joueur "
            		+ "SET AttaqueReussie = " + joueur.getNbAttaqueReussie()+ ", "
            			+ "DefenseReussie = " + joueur.getNbDefenseReussie() + ", "
            			+ "DeUn = " + joueur.getNbDe1() +", "
            			+ "TerritoireConquis = " + joueur.getNbTerritoireConquis()
            		+ " Where IDinscription = " + joueur.getNumeroInscription();
                stmt.executeUpdate(sql);
                
                //Pour le score : code en attente de getJoueurElimine()
//                int scoreObtenu = 0;
//                for(int i = 0 ; i < model.getJoueurElimine().size(); i++) {
//                	scoreObtenu = scoreObtenu + 2;
//                	if(getJoueurElimine().get(i).getNumeroInscription().equals(joueur.getNumeroInscription())) {
//                      sql = "UPDATE participer "
//                		+ "SET score = " + scoreObtenu + ", "
//                		+ "WHERE IDPartie = " + nbPartie + ", "
//                		+ "and IDJoueur = " + joueur.getNumeroInscription();
//                	stmt.executeUpdate(sql);
//                	}
//               }
            }
            
            sql = "Update partie "
            		+ "Set DateFinPartie = " + finPartie
            		+ " Where IDPartie = " + nbPartie;
            stmt.executeUpdate(sql);
            /**
             * Fermer les connexions ouvertes de la BD.
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
