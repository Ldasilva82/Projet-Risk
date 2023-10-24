/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import tp5.controler.AbstractControler;
import tp5.controler.Controler;
import tp5.model.AbstractModel;
import tp5.model.Labyrinthe;
import tp5.vue.Vue;

/**
 *
 * @author david
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Labyrinthe model = new Labyrinthe(10, 10); 
        Controler controler = new Controler(model);
        Vue v = new Vue(model,controler);
        model.addObservateur(v);
        v.setVisible(true);
        while(model.partieTerminer()){
            controler.calculerStepSuivant();
        }
    }
    
}
