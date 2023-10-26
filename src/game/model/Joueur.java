package game.model;

import java.util.ArrayList;
import java.util.Random;

public class Joueur {
	// Attributes
	private int numeroInscription;
	protected String nomJoueur;
	protected String prenomJoueur;
	protected int nbAttaqueReussie;
	protected int nbDefenseReussie;
	protected int nbDe1;
	protected int nbTerritoireConquis;
	private Plateau plateau;
	private ArrayList<Carte> cartePossedee;
	
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
	public int getNumeroInscription() {
		return this.numeroInscription;
	}
	
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
	public void setNumInscription(int numInscrip) {
		this.numeroInscription = numInscrip;
	}
	
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

	
//	public static void main(String[] args) {
//		Joueur joueur = new Joueur("OK", "trro");
//		System.out.println(joueur.lancerDé());
//	}

}
