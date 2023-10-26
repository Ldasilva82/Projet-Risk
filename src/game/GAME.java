/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.controler.AbstractControler;
import game.controler.Controler;
import game.model.AbstractModel;
import game.model.Plateau;
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
        Plateau model = new Plateau(19,14); 
        Controler controler = new Controler(model);
        Vue v = new Vue(model,controler);
        model.addObservateur(v);
        v.setVisible(true);
        while(model.partieTerminer()){
        	System.out.println("yes");
            controler.calculerStepSuivant();
        }
    }
    
}
