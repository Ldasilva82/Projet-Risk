/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.model;

import java.util.ArrayList;

import game.vue.observer.Observable;
import game.vue.observer.Observateur;

/**
 *
 * @author Lucas, Alex, Pauline, ravaka, Yaning
 */
public abstract class AbstractModel implements Observable {
    private ArrayList<Observateur> observateurs;

    public AbstractModel() {
        observateurs = new ArrayList<>();
    }
    
    
    public abstract void nouveauTour();   
    public abstract TypeCase getTypeCase(int x, int y);
    public abstract void setTypeCase(int x, int y,TypeCase tc);
    public abstract boolean partieTerminer();
    public abstract void afficherInfoSelectedTerr(int x, int y);
	public abstract int getLargeur();
	public abstract int getHauteur();
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
