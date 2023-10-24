package tp5.model;

import java.util.Random;

public class Joueur {
	protected String nom;
	protected String prenom;
	protected int attaquereussie;
	protected int defensereussie;
	protected int nbDé1;
	protected int territoireConquis;
	
	
	public Joueur(String nom, String prenom) {
		this.prenom = prenom;
		this.nom = nom;
		this.attaquereussie = 0;
		this.defensereussie = 0;
		this.nbDé1 = 0;
		this.territoireConquis = 0;
	}
	
	public int lancerDé() {
		Random random = new Random();
	    int value = random.nextInt((6 - 1) + 1) + 1;
	    if (value==1) {
	    	this.setNbDé1(nbDé1+1);
	    }
	    return value;
	}

	public int getNbDé1() {
		return nbDé1;
	}

	public void setNbDé1(int nbDé1) {
		this.nbDé1 = nbDé1;
	}
	
	
	
	
//	public static void main(String[] args) {
//		Joueur joueur = new Joueur("OK", "trro");
//		System.out.println(joueur.lancerDé());
//	}

}
