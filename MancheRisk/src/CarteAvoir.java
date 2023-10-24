
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Allows the creation of Risk Hand objects used to handle the cards held by a player.
 */
public class CarteAvoir implements Serializable {

    public boolean condition;
    public ArrayList<CarteManagement> avoirCarte;
  

    public CarteAvoir() {
        avoirCarte = new ArrayList<CarteManagement>();
    }

    /**
     * This method will add card in hand
     */
    public void add(CarteManagement card) {
        avoirCarte.add(card);
    }

   /* Removes the cards at the given indices from the hand*/
    public void removeCards(int index1, int index2, int index3) {

        if (canTurnInCards(index1, index2, index3)) {
            avoirCarte.remove(index3);
            avoirCarte.remove(index2);
            avoirCarte.remove(index1);

        } else {
            System.out.println("You must trade in three cards of the same type or one of each type.");
        }
    }




    /**
    * returns true if the player can turn in cards
    * @param index1 card turned in index 1
    * @param index2 card turned in index 2
    * @param index3 card turned in index 3
    * @return true if the player can turn in cards, otherwise false
    */
    public boolean canTurnInCards(int index1, int index2, int index3) {

        condition = false;

        if (avoirCarte.size() >= 3) {
            // Same type
            if (avoirCarte.get(index1).getTypeSymbole().equals(avoirCarte.get(index2).getTypeSymbole()) && avoirCarte.get(index1).getTypeSymbole().equals(avoirCarte.get(index3).getTypeSymbole())) {
                condition = true;
            // Different type
            } else if (!avoirCarte.get(index1).getTypeSymbole().equals(avoirCarte.get(index2).getTypeSymbole()) && !avoirCarte.get(index1).getTypeSymbole().equals(avoirCarte.get(index3).getTypeSymbole()) && !avoirCarte.get(index2).getTypeSymbole().equals(avoirCarte.get(index3).getTypeSymbole())) {
                condition = true;
            // One Joker and two of the same typesymbol
            } else if ((avoirCarte.get(index1).getTypeSymbole().equals("Joker") && avoirCarte.get(index2).getTypeSymbole().equals(avoirCarte.get(index3).getTypeSymbole())) || 
                       (avoirCarte.get(index2).getTypeSymbole().equals("Joker") && avoirCarte.get(index1).getTypeSymbole().equals(avoirCarte.get(index3).getTypeSymbole())) || 
                       (avoirCarte.get(index3).getTypeSymbole().equals("Joker") && avoirCarte.get(index1).getTypeSymbole().equals(avoirCarte.get(index2).getTypeSymbole()))) {
                condition = true;
            }
        }
        return condition;
    }

   /**
    * getter method which returns true if the player must turn in cards
    * @return true if the player must turn in cards,otherwise false
    */
    public boolean mustTurnInCards() {

        condition = avoirCarte.size() >= 5;
        return condition;
    }

   /**
    * getter method returns the hand
    * @return hand player object
    */
    public ArrayList<CarteManagement> getCards() {
        return avoirCarte;
    }

}