package game.model;

import java.util.Random;

public class Joueur {
	// Attributes
	protected String nomJoueur;
	protected String prenomJoueur;
	protected int nbAttaqueReussie;
	protected int nbDefenseReussie;
	protected int nbDe1;
	protected int nbTerritoireConquis;
	
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
	public int getNbDe1() {
		return nbDe1;
	}
	public String getPrenomJoueur() {
		return prenomJoueur;
	}
	 public String getNomJoueur() {
		 return nomJoueur;
	 }
	
	/// Setters
	public void setNbDe1(int nbDé1) {
		this.nbDe1 = nbDé1;
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


	
//	public static void main(String[] args) {
//		Joueur joueur = new Joueur("OK", "trro");
//		System.out.println(joueur.lancerDé());
//	}

}
