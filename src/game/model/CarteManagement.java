package game.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarteManagement implements Serializable {

    
    private String[] types;
    public ArrayList<String> cartes;
    private String retirerCarte;
    
    
    
    public CarteManagement(){
        cartes = new ArrayList<>();
    }



/*composer carte */
    public void getCarteManagement() {
        String[] types = new String[]{"Infanterie", "Cavalerie", "Artillerie"};
	    String[] infanteries = new String[]{"Islande", "Kamchatka", "Mongolie", "Chine", "Moyen-Orient", "Asie du Sud-Est", "Nouvelle Guinée", "Egypte", "Afrique Orientale", "Afrique Centrale", "Alaska", "Venezuela", "Pérou", "Argentine"};
	    String[] artilleries = new String[]{"Grande-Bretagne", "Europe de l'Ouest", "Europe du Sud", "Europe du Nord", "Japon", "Indonésie", "Australie Occidentale", "Australie Orientale", "Afrique du Sud", "Territoires du Nord-Ouest", "Etats-Unis de l'Ouest", "Etats-Unis de l'Est", "Amerique Centrale", "Brésil"};
	    String[] cavaleries = new String[]{"Scandinavie", "Russie", "Oural", "Sibérie", "Yakoutie", "Irkoutsk", "Afghanistan", "Inde", "Afrique du Nord", "Madagascar", "Groenland", "Alberta", "Ontario", "Canada de l'Est"};

	    for (int i = 0; i < types.length; i++) {
	        String type = types[i];
	        if (type.equals("Infanterie")) {
	            for (int j = 0; j < infanteries.length; j++) {
	                cartes.add(type + " " + infanteries[j]);
	            }
	        } else if (type.equals("Artillerie")) {
	            for (int j = 0; j < artilleries.length; j++) {
	                cartes.add(type + " " + artilleries[j]);
	            }
	        } else if (type.equals("Cavalerie")) {
	            for (int j = 0; j < cavaleries.length; j++) {
	                cartes.add(type + " " + cavaleries[j]);
	            }
	        }
	    }

	    // Add two Jokers to the cartes list
	    cartes.add("Joker");
	    cartes.add("Joker");
	    Collections.shuffle(cartes);

	    // Print the elements in the list
	    for (String carte : cartes) {
	    	
	        System.out.println(carte);
	    }
    }

	public String getTypeSymbole() {
        if (cartes.isEmpty()) {
            return null; // or throw an exception, depending on your use case
        }
        String firstCarte = cartes.get(0);
        String[] splitCarte = firstCarte.split(" ");
        if (splitCarte.length < 2) {
            return null; // or throw an exception, depending on your use case
        }
        return splitCarte[0];
    }

    /**
     * Removes a card from the cartes and return it
     */
    public String retirer() {

        retirerCarte = cartes.get(0);
        cartes.remove(0);

        return retirerCarte;
    }


    public void add(String card) {

        cartes.add(card);
    }

  /*mélanger les cartes aléatoirement */
    public void shuffle() {

        Collections.shuffle(cartes);
    }



    
    
}
