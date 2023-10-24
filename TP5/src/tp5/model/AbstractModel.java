/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.model;

import java.util.ArrayList;
import tp5.vue.observer.Observable;
import tp5.vue.observer.Observateur;

/**
 *
 * @author david
 */
public abstract class AbstractModel implements Observable {
    private ArrayList<Observateur> observateurs;

    public AbstractModel() {
        observateurs = new ArrayList<>();
    }
    public abstract void Flecher(int x, int y);
    
    public abstract void faireSeDeplacerLesAnimaux();
    
    public abstract TypeCase getTypeCase(int x, int y);
    public abstract void setTypeCase(int x, int y,TypeCase tc);
    public abstract Animal getAnimalPlusFort(int x, int y);
    public abstract int getLargeur();
    public abstract int getHauteur();
    public abstract int getNbSourisIn();
    public abstract int getNbSourisOut();
    public abstract int getNbFlecheUtilisee();
    public abstract int getNbFlecheMax();
    public abstract boolean partieTerminer();

    @Override
    public void demandeMiseAjourVue(){
        for(Observateur o : observateurs){
            o.update();
        }
    }

    @Override
    public void removeObservateur(Observateur o){
        observateurs.remove(o);
    }

    @Override
    public void addObservateur(Observateur o){
        observateurs.add(o);
    }
    
}
