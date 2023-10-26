package game.model;

import java.util.ArrayList;
import java.util.List;

public class CarteJoker extends Carte {
	public List<String> cartesJoker;
	
	public CarteJoker() {
        super();
        this.cartesJoker = new ArrayList<>(); 

    }
	
	public void getCarteManagementJoker() {
	    // Add two Jokers to the cartes list
		cartesJoker.add("Joker Joker");
		cartesJoker.add("Joker Joker");
	

	   
    }


}
