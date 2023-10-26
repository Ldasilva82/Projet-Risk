package game.model;

import java.util.ArrayList;
import java.util.Random;

public class Joueur {
	// Attributes
	protected String nomJoueur;
	protected String prenomJoueur;
	protected int nbAttaqueReussie;
	protected int nbDefenseReussie;
	protected int nbDe1;
	protected int nbTerritoireConquis;
	private Plateau plateau;
	private ArrayList<Carte> cartePossedee;
	private Territoire territoire;
	private Carte carte;
	
	// Constructor
	public Joueur(String nom, String prenom) {
		this.prenomJoueur = prenom;
		this.nomJoueur = nom;
		this.nbAttaqueReussie = 0;
		this.nbDefenseReussie = 0;
		this.nbDe1 = 0;
		this.nbTerritoireConquis = 0;
	}
	
	// Methods
	/// Getters
	public String getNomJoueur() {
		return nomJoueur;
	}

	public String getPrenomJoueur() {
		return prenomJoueur;
	}
	
	public int getNbDe1() {
		return nbDe1;
	}
	
	public int getNbAttaqueReussie() {
		return nbAttaqueReussie;
	}


	public int getNbDefenseReussie() {
		return nbDefenseReussie;
	}


	public int getNbTerritoireConquis() {
		return nbTerritoireConquis;
	}
	
	public ArrayList<Carte> getCartePossedee(){
		return this.cartePossedee;
	}
	
	/// Setters
	public void setNbDe1(int nbDé1) {
		this.nbDe1 = nbDé1;
	}
	
	public void setNbAttaqueReussie(int nbAttaqueReussie) {
		this.nbAttaqueReussie = nbAttaqueReussie;
	}
	
	public void setNbDefenseReussie(int nbDefenseReussie) {
		this.nbDefenseReussie = nbDefenseReussie;
	}
	
	public void setNbTerritoireConquis(int nbTerritoireConquis) {
		this.nbTerritoireConquis = nbTerritoireConquis;
	}
	
	/// Others
	public int lancerDes() {
		Random random = new Random();
	    int value = random.nextInt((6 - 1) + 1) + 1;
	    if (value==1) {
	    	this.setNbDe1(nbDe1+1);
	    }
	    return value;
	}
	
	public void piocher() {
		//recupérer la carte situé en première position du deck de plateau 
		Carte premiereCarte = plateau.getDeck().get(0);
		//l'ajouter à la liste cartePossedee
		cartePossedee.add(premiereCarte);
		//la retirer du deck de plateau
		plateau.getDeck().remove(0);
	}

<<<<<<< HEAD
=======
	public boolean canTurnInCards(int index1, int index2, int index3) {
        boolean condition = false;
        if (cartePossedee.size() >= 3) {
            Carte typeSymbole1 = cartePossedee.get(index1);
            Carte typeSymbole2 = cartePossedee.get(index2);
            Carte typeSymbole3 = cartePossedee.get(index3);
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

	public void echangeCarte(int index1, int index2, int index3){
		
		if (canTurnInCards(index1, index2, index3)) {
			int nbe = plateau.getNbEchange();
            int armiesEarned = 0;
            if (nbe == 1) {
                armiesEarned = 4;
            } else if (nbe == 2) {
                armiesEarned = 6;
            } else if (nbe == 3) {
                armiesEarned = 8;
            } else if (nbe == 4) {
                armiesEarned = 10;
            }else if (nbe == 5) {
                armiesEarned = 12;
			}else if (nbe == 6) {
                armiesEarned = 15;
			}	
            nbe++;
        }
    }
	


>>>>>>> Carte_Piocher
	
//	public static void main(String[] args) {
//		Joueur joueur = new Joueur("OK", "trro");
//		System.out.println(joueur.lancerDé());
//	}

}
