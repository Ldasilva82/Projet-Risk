/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

//import game.controler.AbstractControler;
import game.controler.Controler;
//import game.model.AbstractModel;
import game.model.Carte;
import game.model.CarteJoker;
import game.model.CarteTerritoire;
import game.model.TypeCarte;
import game.model.Joueur;
import game.model.Plateau;
import game.model.Territoire;
import game.vue.Vue;

/**
 *
 * @author david
 */
public class GAME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	// Créez d'abord le modèle et le contrôleur
        Plateau model = new Plateau(19, 19);
        Controler controler = new Controler(model);

        // Créez ensuite la vue en passant le modèle et le contrôleur
        Vue v = new Vue(model, controler);

        // Mettez à jour le modèle avec la référence à la vue
        model.setVue(v);

        // Affichez la vue
        v.setVisible(true);

        // Créez une instance factice du joueur
        Joueur joueurFactice = new Joueur("Paul","Mirabel");
        Territoire territoire = new Territoire("Alaska");
        Carte carteTerritoire = new CarteTerritoire(territoire, TypeCarte.ARTILLERIE);
        Carte carteJoker = new CarteJoker();
        joueurFactice.ajouterCartePiochee(carteTerritoire);
        joueurFactice.ajouterCartePiochee(carteJoker);

        // Utilisez l'instance factice du joueur pour tester l'affichage
        v.afficherInfoJoueur(joueurFactice, v);
        while(model.partieTerminer()){
        	System.out.println("yes");
            controler.calculerStepSuivant();
        }
    
  
    }}
