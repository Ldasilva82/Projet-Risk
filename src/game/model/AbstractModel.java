
package game.model;

import java.util.ArrayList;

import game.vue.observer.Observable;
import game.vue.observer.Observateur;

/**
 *
 * @author Alex, Lucas, Pauline, Ravaka, Yaning
 */
public abstract class AbstractModel implements Observable {
    private ArrayList<Observateur> observateurs;

    public AbstractModel() {
        observateurs = new ArrayList<>();
    }
    
    
    public abstract void nouveauTour();
    
    public abstract TypeCase getTypeCase(int x, int y);
    public abstract void setTypeCase(int x, int y,TypeCase tc);
    //public abstract Joueur getAnimalPlusFort(int x, int y);
    public abstract boolean partieTerminer();
    public abstract void selectTer(int x, int y);
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
