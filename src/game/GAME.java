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
        
        String DB_URL = "jdbc:mysql://localhost:3306/manche_risk";
        //Compte accédant à la base de données
        String USER = "root";
        String PWD = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PWD); 
            System.out.println("Connecté");
            Statement stmt = conn.createStatement();
            String sql = "Select * from Joueur";
            ResultSet resultSet = stmt.executeQuery(sql);
            while(resultSet.next()){
                int idInscription = resultSet.getInt("IDinscription");
                String nomJoueur  = resultSet.getString("NomJoueur");
                String prenomJoueur = resultSet.getString("PrenomJoueur");
                Joueur joueurBD = new Joueur(nomJoueur,prenomJoueur);
                joueurBD.setNumInscription(idInscription);
                System.out.println(joueurBD.getNomJoueur().toUpperCase()+ " " + joueurBD.getPrenomJoueur());
                model.getOrdreJoueur().add(joueurBD);
            }
            
            /*
            Fermer les connexions ouvertes de la BD.
             
            */
            
            resultSet.close();
            stmt.close();
            conn.close();

        } catch (Exception e){
               e.printStackTrace();
               System.out.println("Erreur");
               System.exit(0);
        }
        while(model.partieTerminer()){
        	System.out.println("yes");
            controler.calculerStepSuivant();
        } 
    }
 }
