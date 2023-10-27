package game.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class Joueur {
	// Attributes
	protected String nomJoueur;
	protected String prenomJoueur;
	protected int nbAttaqueReussie;
	protected int nbDefenseReussie;
	protected int nbDe1;
	protected int nbTerritoireConquis;
	private Plateau plateau;
	public ArrayList<Carte> cartePossedees;
	
	// Constructor
	public Joueur(String nom, String prenom) {
		this.prenomJoueur = prenom;
		this.nomJoueur = nom;
		this.nbAttaqueReussie = 0;
		this.nbDefenseReussie = 0;
		this.nbDe1 = 0;
		this.nbTerritoireConquis = 0;
		this.cartePossedees = new ArrayList<Carte>(); 
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
	
	public ArrayList<Carte> getCartesPossedees() {
		return this.cartePossedees;
		
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
	
	/// GAME
	//Methode pour lancé les des
	public int lancerDes() {
		Random random = new Random();
	    int value = random.nextInt((6 - 1) + 1) + 1;
	    if (value==1) {
	    	this.setNbDe1(nbDe1+1);
	    }
	    return value;
	}
	
	//Methode pour piocher une carte
	public void piocher() {
		//recupérer la carte situé en première position du deck de plateau 
		Carte premiereCarte = plateau.getDeck().get(0);
		//l'ajouter à la liste cartePossedee
		cartePossedees.add(premiereCarte);
		//la retirer du deck de plateau
		plateau.getDeck().remove(0);
	}

	/// Méthode pour ajouter une carte piochée ses cartesPossédées
		public void ajouterCartePiochee(Carte carte) {
			cartePossedees.add(carte);
		}
		
	/// Méthode pour afficher les cartes du joueur
		 public void afficherCartesPossedees() {
		        System.out.println("Cartes possédées par " + getPrenomJoueur() + ":");
		        for (Carte carte : cartePossedees) {
		            if (carte instanceof CarteTerritoire) {
		                CarteTerritoire carteTerritoire = (CarteTerritoire) carte;
		                System.out.println("Territoire: " + carteTerritoire.getTerritoire().getNomTerritoire() + ", Type: " + carte.getType());
		            } else {
		                System.out.println("Joker, Type: " + carte.getType());
		            }
		        }
		    }

		// Méthode pour échanger des cartes
	    public void echangerCartes(List<Carte> cartesEnMain, Territoire territoire) {
	        if (cartesEnMain.size() >= 3) {
	            if (memeType(cartesEnMain) || differentType(cartesEnMain) || typeJoker(cartesEnMain)) {
	                int nbRegiment = 0;
	                switch (plateau.getNbEchange()) {
	                    case 0:
	                        nbRegiment = 4;
	                        break;
	                    case 1:
	                        nbRegiment = 6;
	                        break;
	                    case 2:
	                        nbRegiment = 8;
	                        break;
	                    case 3:
	                        nbRegiment = 10;
	                        break;
	                    case 4:
	                        nbRegiment = 12;
	                        break;
	                    case 5:
	                        nbRegiment = 15;
	                        break;
	                    default:
	                        nbRegiment = 15 + 5 * (plateau.getNbEchange() - 2); // +5 régiments pour chaque échange au-delà du 3ème
	                        break;
	                }
	                // Ajouter régiments au joueur
	                territoire.ajouterRegiments(nbRegiment);
	                
	                // Vérifier si le joueur échange une carte de territoire dont il est propriétaire
	                for (Carte carte : cartesEnMain) {
	                	if (carte instanceof CarteTerritoire && ((CarteTerritoire) carte).getTerritoire() == territoire) {
	                        territoire.ajouterRegiments(2);
	                    }
	                }
	                plateau.nbEchange++;
	            } else {
	                System.out.println("Combinaison de cartes invalide.");
	            }
	        } else {
	            System.out.println("Vous devez avoir au moins 3 cartes pour effectuer un échange.");
	        }
	    }
	    public boolean memeType(List<Carte> cartesEnMain) {
	        if (cartesEnMain.size() != 3) {
	            return false; // Il doit y avoir exactement 3 cartes pour cette combinaison

	        // Récupérer le type de la première carte
	        TypeCarte premierType = cartesEnMain.get(0).getType();

	        // Vérifier que les types des deux autres cartes correspondent
	        for (int i = 1; i < 3; i++) {
	            if (cartesEnMain.get(i).getType() != premierType) {
	                return false; // Au moins une carte est d'un type différent
	            }
	        }

	        return true; // Toutes les cartes sont du même type
	    }
	    
	    

	    public boolean differentType(List<Carte> cartesEnMain) {
	        if (cartesEnMain.size() != 3) {
	            return false; 
	        }

	        // Créer un ensemble (Set) pour stocker les types de cartes uniques
	        Set<TypeCarte> typesUniques = new HashSet<>();

	        for (Carte carte : cartesEnMain) {
	            TypeCarte type = carte.getType();
	            if (typesUniques.contains(type)) {
	                return false; // Au moins une carte a un type déjà présent
	            }
	            typesUniques.add(type);
	        }

	        return true; // Les trois cartes sont de types différents
	    }

	    public boolean typeJoker(List<Carte> cartesEnMain) {
	        if (cartesEnMain.size() != 3) {
	            return false; 
	        }

	        // Créer un ensemble (Set) pour stocker les types de cartes unique
	        Set<TypeCarte> typesUniques = new HashSet<>();
	        boolean aJoker = false;

	        for (Carte carte : cartesEnMain) {
	            TypeCarte type = carte.getType();
	            if (type == TypeCarte.JOKER) {
	                aJoker = true;
	            } else {
	                if (typesUniques.contains(type)) {
	                    return false; // Au moins une carte a un type déjà présent
	                }
	                typesUniques.add(type);
	            }
	        }

	        return aJoker; // Les trois cartes sont de types différents et il y a un Joker
	    }

	
//	public static void main(String[] args) {
//		Joueur joueur = new Joueur("OK", "trro");
//		System.out.println(joueur.lancerDé());
//	}

}
