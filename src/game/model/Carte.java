package game.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Carte {
	List<String> cartesTerritoire = new ArrayList<>();
	List<String> cartesJoker = new ArrayList<>();
	public boolean condition;
	private String carte;
	public ArrayList<String> avoirCarte;
	List<String> combinedList;
  
  

	    public Carte() {
	        this.cartesTerritoire = new ArrayList<>();
	        this.cartesJoker = new ArrayList<>();
	        this.avoirCarte = new ArrayList<>();
	        this.carte = carte;
	        this.combinedList = new ArrayList<>();

	    }
	    public ArrayList<String> getCards() {
            return avoirCarte;
	    }

	    public void getCarteManagementcTerritoire() {
	        CarteTerritoire carteTerritoire = new CarteTerritoire(carte, carte);
	        carteTerritoire.getCarteManagementcTerritoire();
	        cartesTerritoire.addAll(carteTerritoire.cartesTerritoire);
	    }

	    public void getCarteManagementJoker() {
	        CarteJoker carteJoker = new CarteJoker();
	        carteJoker.getCarteManagementJoker();
	        cartesJoker.addAll(carteJoker.cartesJoker);
	    }
	    
	    public void combineLists() {
	        getCarteManagementcTerritoire();
	        getCarteManagementJoker();

	        List<String> combinedList = new ArrayList<>();
	        combinedList.addAll(cartesJoker);  	
	        combinedList.addAll(cartesTerritoire);
	        Collections.shuffle(combinedList);
	        //System.out.println(combinedList);
	        for (String carte : combinedList) {
		    	
		       // System.out.println(carte);
		       
		    }
	    }

	       // System.out.println(combinedList);

	    public String retirer() {
	        String retirerCarte = combinedList.get(0);
	        combinedList.remove(0);
	        return retirerCarte;
	    }

	    public void add(String card) {
	    	combinedList.add(card);
	    }
	    
	    public String getTypeSymbol() {
	        combineLists(); // 调用 combineLists() 方法来填充 combinedList
	        if (combinedList != null && !combinedList.isEmpty()) {
	            return combinedList.get(0);
	        }
	        return null;
	    }
	    
	    public boolean canTurnInCards(int index1, int index2, int index3) {
	        boolean condition = false;
	        combineLists(); // 调用 combineLists() 方法来填充 combinedList
	        if (avoirCarte.size() >= 3) {
	            String typeSymbole1 = avoirCarte.get(index1);
	            String typeSymbole2 = getTypeSymbol();
	            String typeSymbole3 = getTypeSymbol();
	            // Same type
	            if (typeSymbole1.equals(typeSymbole2) && typeSymbole1.equals(typeSymbole3)) {
	                condition = true;
	                // Different type
	            } else if (!typeSymbole1.equals(typeSymbole2) && !typeSymbole1.equals(typeSymbole3) && !typeSymbole2.equals(typeSymbole3)) {
	                condition = true;
	                // One Joker and two of the same type symbol
	            } else if ((typeSymbole1.equals("Joker") && typeSymbole2.equals(typeSymbole3)) ||
	                    (typeSymbole2.equals("Joker") && typeSymbole1.equals(typeSymbole3)) ||
	                    (typeSymbole3.equals("Joker") && typeSymbole1.equals(typeSymbole2))) {
	                condition = true;
	            }
	        }
	        return condition;
	    }

	    
	    /*
	    public String getTypeSymbol() {
	    	
	        if (combinedList.isEmpty()) {
	            return null; // or throw an exception, depending on your use case
	        }
	        String firstCarte = (String) combinedList.get(0);
	   
	        String[] typeCarte = firstCarte.split(" ");
	        if (typeCarte.length < 2) {
	            return null; // or throw an exception, depending on your use case
	        }
	        return typeCarte[0];
	    }
	    */
	   

	    /*
	    public void possedeCard(int index) {
	    	 String selectedCard = combinedList.get(index); // 从combinedList中获取所需的卡片字符串
	    	 String newCarte = new Carte(); // 使用选定的卡片字符串创建一个新的Carte对象
	    	    avoirCarte.add(newCarte);
	        }
	    
	    public boolean canTurnInCards(int index1, int index2, int index3) {
	        boolean condition = false;
	        if (avoirCarte.size() >= 3) {
	            String typeSymbole1 = avoirCarte.get(index1).getTypeSymbol();
	            String typeSymbole2 = avoirCarte.get(index2).getTypeSymbol();
	            String typeSymbole3 = avoirCarte.get(index3).getTypeSymbol();
	            // Same type
	            if (typeSymbole1.equals(typeSymbole2) && typeSymbole1.equals(typeSymbole3)) {
	                condition = true;
	                // Different type
	            } else if (!typeSymbole1.equals(typeSymbole2) && !typeSymbole1.equals(typeSymbole3) && !typeSymbole2.equals(typeSymbole3)) {
	                condition = true;
	                // One Joker and two of the same type symbol
	            } else if ((typeSymbole1.equals("Joker") && typeSymbole2.equals(typeSymbole3)) ||
	                    (typeSymbole2.equals("Joker") && typeSymbole1.equals(typeSymbole3)) ||
	                    (typeSymbole3.equals("Joker") && typeSymbole1.equals(typeSymbole2))) {
	                condition = true;
	            }
	        }
	        return condition;
	    }

	        
	        public void removeCards(int index1, int index2, int index3) {

	            if (canTurnInCards(index1, index2, index3)) {
	                avoirCarte.remove(index3);
	                avoirCarte.remove(index2);
	                avoirCarte.remove(index1);

	            } else {
	                System.out.println("You must trade in three cards of the same type or one of each type.");
	            }
	        }
	        
	        public boolean mustTurnInCards() {

	            condition = avoirCarte.size() >= 5;
	            return condition;
	        }
*/
	       /**
	        * getter method returns the hand
	        * @return hand player object
	        */
	        
	        

	
	    
	    



}

