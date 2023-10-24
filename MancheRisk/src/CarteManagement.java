import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CarteManagement implements Serializable {

    private int i;

    private String input;
    private String name;

    private String[] typesArray;

    public ArrayList<Carte> deck;

    private Carte drawCard;

   /**
    *  Creates all cards, one for each territory. Each card has either
     * a type of Infantry, Cavalry, or Artillery.
    */
    public CarteManagement(ArrayList<Territoire> territoire) {

        Collections.shuffle(territoire);

        //Types of cards
        typesArray = new String[]{"Infanteries", "Cavaleries", "Artilleries"};

        deck = new ArrayList<Carte>();

        for (i = 0; i < territoire.size(); i++) {
            // Add new cards to deck
            deck.add(new Carte(typesArray[i % 3], territoire.get(i)));
            //System.out.println("Added new card to deck: " + deck.get(i).getName());
        }
        Collections.shuffle(deck);
    }

    /**
     * Public default constructor to access other methods.
     */
    public CarteManagement(){
        deck = new ArrayList<>();
    }

    /**
     * Removes a card from the deck and return it
     * @return card object
     */
    public Carte draw() {

        drawCard = deck.get(0);
        deck.remove(0);

        return drawCard;
    }

   /**
    * Add a card to the deck
    * @param card name of the card which is to be added to deck
    */
    public void add(Carte card) {

        deck.add(card);
    }

   /**
    * Shuffle the deck of cards
    */
    public void shuffle() {

        Collections.shuffle(deck);
    }
    
}
