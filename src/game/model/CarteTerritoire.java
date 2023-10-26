package game.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CarteTerritoire extends Carte {
	private  String territoireName;
	private  String type;
	public List<String> cartesTerritoire;

    public CarteTerritoire(String territoireName, String type) {
        super();
        this.territoireName = territoireName;
		this.type = type;
		this.cartesTerritoire = new ArrayList<>(); 
    }
    
    
    public void getCarteManagementcTerritoire() {
        String[] types = new String[]{"Infanterie", "Cavalerie", "Artillerie"};
	    String[] infanteries = new String[]{"Islande", "Kamchatka", "Mongolie", "Chine", "Moyen-Orient", "Asie du Sud-Est", "Nouvelle Guinée", "Egypte", "Afrique Orientale", "Afrique Centrale", "Alaska", "Venezuela", "Pérou", "Argentine"};
	    String[] artilleries = new String[]{"Grande-Bretagne", "Europe de l'Ouest", "Europe du Sud", "Europe du Nord", "Japon", "Indonésie", "Australie Occidentale", "Australie Orientale", "Afrique du Sud", "Territoires du Nord-Ouest", "Etats-Unis de l'Ouest", "Etats-Unis de l'Est", "Amerique Centrale", "Brésil"};
	    String[] cavaleries = new String[]{"Scandinavie", "Russie", "Oural", "Sibérie", "Yakoutie", "Irkoutsk", "Afghanistan", "Inde", "Afrique du Nord", "Madagascar", "Groenland", "Alberta", "Ontario", "Canada de l'Est"};

	    for (int i = 0; i < types.length; i++) {
	        String type = types[i];
	        if (type.equals("Infanterie")) {
	            for (int j = 0; j < infanteries.length; j++) {
	            	cartesTerritoire.add(type + " " + infanteries[j]);
	            }
	        } else if (type.equals("Artillerie")) {
	            for (int j = 0; j < artilleries.length; j++) {
	            	cartesTerritoire.add(type + " " + artilleries[j]);
	            }
	        } else if (type.equals("Cavalerie")) {
	            for (int j = 0; j < cavaleries.length; j++) {
	            	cartesTerritoire.add(type + " " + cavaleries[j]);
	            }
	        }
	    }
	    Collections.shuffle(cartesTerritoire);
	    

	  
    }

	


    
    
    
    
    

	

}
