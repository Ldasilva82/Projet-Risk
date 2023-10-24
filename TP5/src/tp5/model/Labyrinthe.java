package tp5.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Labyrinthe extends AbstractModel {
	protected Case[][] labyrinthe;
	protected int hauteur;
	protected int largeur;
	protected int NbSourisIn;
	protected int NbSourisOut;
	protected int NbSourisMorte;
	protected int NbSourisMax;
	protected int NbFlecheMax;
	protected int NbFlecheUtilisee;
	


	//	Constructeur prenant en paramètre la taille de notre labyrinthe
	public Labyrinthe(int largeur, int hauteur) {
		this.labyrinthe = new Case[largeur][hauteur];
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.NbFlecheMax = 2;
		this.NbSourisIn = 10;
		this.NbSourisMax = 10;
		this.NbSourisOut = 0;
		
//		Création d'une case pour chaque cellules du tableau et initialisation de son type a MUR
		for(int y=0; y<this.getHauteur(); y++) {
			for (int x=0; x<this.getLargeur(); x++) {
				Case newCase = new Case(x, y);
				newCase.setType(TypeCase.MUR);			
				this.labyrinthe[x][y]= newCase;
			}
		}
//		Transformation des cases du centre en CHEMIN
		for(int y=1; y<this.getHauteur()-1; y++) {
			for (int x=1; x<this.getLargeur()-1; x++) {
				this.labyrinthe[x][y].setType(TypeCase.CHEMIN);
			}
		}
//		Création de l'entrée
		this.labyrinthe[1][1].setType(TypeCase.IN);
//		Création de la sortie
		this.labyrinthe[this.getLargeur()-2][this.getHauteur()-2].setType(TypeCase.OUT);
		
		Animal chat1 = new Chat(1, 2, 1, "haut");
		Animal chat2 = new Chat(2, 6, 3, "gauche");
		labyrinthe[2][2].getAnimaux().add(chat1);
		labyrinthe[6][3].getAnimaux().add(chat2);
		
		
		
	}
	
///////////////////////////GETTERS
	
//	Renvoie le TypeCase en fonction des coordonnées placées en attribut
	public TypeCase getTypeCase(int x, int y) {
		
		TypeCase type = labyrinthe[x][y].getType();
		
		return type;
		
	}

//	renvoie la hauteur du labyrinthe
	public int getHauteur() {
		return hauteur;
	}

//	renvoie la largeur du labyrinthe
	public int getLargeur() {
		return largeur;
	}
	
//	renvoie le nombre de souris encore dans le trou
	public int getNbSourisIn() {
		return NbSourisIn;
	}

//	renvoie le nombre de souris sortie du labyrinthe
	public int getNbSourisOut() {
		return NbSourisOut;
	}
	
//	renvoie le nombre de flèches utilisables dans la partie
	public int getNbFlecheMax() {
		return NbFlecheMax;
	}

//	renvoie le nombre de flèches déja utilisées
	public int getNbFlecheUtilisee() {
		return NbFlecheUtilisee;
	}
	
//////////////////////////SETTERS
	
//	modifie le nombre de souris mortes
	public void setNbSourisMorte(int nbSourisMorte) {
		NbSourisMorte = nbSourisMorte;
	}

//	modifie le nombre de souris hros du labyrinthe
	public void setNbSourisOut(int nbSourisOut) {
		NbSourisOut = nbSourisOut;
	}

//	modifie le nombre de souris encore dans le trou
	public void setNbSourisIn(int nbSourisIn) {
		NbSourisIn = nbSourisIn;
	}
	
//	Modifie le nombre de flèche utilisée
	public void setNbFlecheUtilisee(int nbFlecheUtilisee) {
		NbFlecheUtilisee = nbFlecheUtilisee;
	}

//	définit le type d'une case
	@Override
	public void setTypeCase(int x, int y, TypeCase tc) {
		labyrinthe[x][y].setType(tc);
		demandeMiseAjourVue();
		System.out.println("doubleoui");
		
	}
	
	
//	Vérifie si la partie est toujours en cours
	public boolean partieTerminer() {
		if(NbSourisOut + NbSourisMorte != NbSourisMax) {
			return true;
		}
		else return false;
		}
	
//	retourne l'animal le plus fort d'une case choisie en paramètre
	public Animal getAnimalPlusFort(int x, int y) {
		Animal aniRetour = null;
		for(Animal a : labyrinthe[x][y].getAnimaux()) {
			if(a.getClass().equals(Chat.class) ) {
				aniRetour = a;
			}
			else if ( aniRetour == null) {
				if(a.getClass().equals(Souris.class)) {
					aniRetour = a;
					}
				}
		}
		return aniRetour;
		}		
	
	public void faireSeDeplacerLesAnimaux() {
		ArrayList<Object[]> aAjouter = new ArrayList<>();
		ArrayList<Object[]> aSupprimer = new ArrayList<>();
		
//Faire sortir les souris du trou et mise a jour du compteur de souris
		if(NbSourisIn>0) {
			Animal souris = new Souris(NbSourisIn, 1,1, "droite");
			labyrinthe[1][1].getAnimaux().add(souris);
			this.setNbSourisIn(NbSourisIn - 1);
		}
		
//Faire sortir les souris du labyrinthe
		if(this.labyrinthe[this.getLargeur()-2][this.getHauteur()-2].getAnimaux().isEmpty() == false) {
			for(Iterator<Animal> it = labyrinthe[this.getLargeur()-2][this.getHauteur()-2].getAnimaux().iterator(); it.hasNext();) {
				Animal a = it.next();
				if(a.getClass().equals(Souris.class)) {
					Object[] tuple = {a, this.getLargeur()-2 , this.getHauteur()-2};
					aSupprimer.add(tuple);
					this.setNbSourisOut(NbSourisOut + 1);
				}
			}
		}

//on force un animal situé sur une flèche a garder cette direction
		for(int y=0; y<this.getHauteur(); y++) {
			for (int x=0; x<this.getLargeur(); x++) {
				if(this.labyrinthe[x][y].getAnimaux() !=null) {
					for (Iterator<Animal> iterator = labyrinthe[x][y].getAnimaux().iterator(); iterator.hasNext();) {
					    Animal a = iterator.next();
					    String dir = a.SeDeplacer();
					    if (a.getClass().equals(Souris.class)) {
					    	if (this.labyrinthe[x][y].getType().equals(TypeCase.FLECHE_BAS)){
						    	a.setDirection("bas");
						    }
						    else if (this.labyrinthe[x][y].getType().equals(TypeCase.FLECHE_HAUT)){
						    	a.setDirection("haut");
						    }
						    else if (this.labyrinthe[x][y].getType().equals(TypeCase.FLECHE_DROITE)){
						    	a.setDirection("droite");
						    }
						    else if (this.labyrinthe[x][y].getType().equals(TypeCase.FLECHE_GAUCHE)){
						    	a.setDirection("gauche");
						    }
					    }
					   
					
					    
//Ici on teste la présence d'un mur en face de l'animal
//Soit on ajouter a la liste des déplacement un tuple {Animal, int (x), int (y)} a faire en fin de boucle et on supprime l'animal
//de son ancienne case
//Soit on le fait tourner
					    if (dir.equals("haut") && this.labyrinthe[x][y - 1].getType() != TypeCase.MUR) {
					    	Object[] tuple = {a, x, y-1};
					    	aAjouter.add(tuple);
					        iterator.remove();
					    }
					    if (dir.equals("haut") && this.labyrinthe[x][y - 1].getType() == TypeCase.MUR){
					    	if(this.labyrinthe[x][y].getType().equals(TypeCase.CHEMIN) || this.labyrinthe[x][y].getType().equals(TypeCase.IN) ) {
					    		a.Tourner();
					    	}			    	
					    }
					    if (dir.equals("bas") && this.labyrinthe[x][y + 1].getType() != TypeCase.MUR) {
					    	Object[] tuple = {a, x, y+1};
					    	aAjouter.add(tuple);					       
					        iterator.remove();
					    }
					    if (dir.equals("bas") && this.labyrinthe[x][y + 1].getType() == TypeCase.MUR){
					    	if(this.labyrinthe[x][y].getType().equals(TypeCase.CHEMIN)) {
					    		a.Tourner();
					    	}
					    }
					    if (dir.equals("droite") && this.labyrinthe[x + 1][y].getType() != TypeCase.MUR) {
					    	Object[] tuple = {a, x+1, y};
					    	aAjouter.add(tuple);				        
					        iterator.remove(); 
					    }
					    if (dir.equals("droite") && this.labyrinthe[x + 1][y].getType() == TypeCase.MUR){
					    	if(a.getClass().equals(Chat.class)) {
					    		a.Tourner();
					    	}
					    	else if(this.labyrinthe[x][y].getType().equals(TypeCase.CHEMIN)) {
					    		a.Tourner();
					    	}
					    }
					    if (dir.equals("gauche") && this.labyrinthe[x - 1][y].getType() != TypeCase.MUR) {
					    	Object[] tuple = {a, x-1, y};
					    	aAjouter.add(tuple);
					        iterator.remove(); 
					    }
					    if (dir.equals("gauche") && this.labyrinthe[x - 1][y].getType() == TypeCase.MUR){
					    	if(this.labyrinthe[x][y].getType().equals(TypeCase.CHEMIN) || this.labyrinthe[x][y].getType().equals(TypeCase.IN) ) {
					    		a.Tourner();
					    	}
					    }
					}
				}			
			}		
		}
		
		
//Ici on traite notre liste de tuple et on insère les animaux dans les cases qui correspondent aux coordonnées x y
		for(Object[] tuple : aAjouter) {
			labyrinthe[ (int) tuple[1]][ (int) tuple[2]].getAnimaux().add( (Animal) tuple[0]);
			if(labyrinthe[ (int) tuple[1]][ (int) tuple[2]].getType().equals(TypeCase.FLECHE_BAS)) {
				if(((Animal) tuple[0]).getClass().equals(Souris.class)) {
					((Animal) tuple[0]).setDirection("bas");
				}
			}
			else if(labyrinthe[ (int) tuple[1]][ (int) tuple[2]].getType().equals(TypeCase.FLECHE_GAUCHE)) {
				if(((Animal) tuple[0]).getClass().equals(Souris.class)) {
					((Animal) tuple[0]).setDirection("gauche");
				}
			}
			else if(labyrinthe[ (int) tuple[1]][ (int) tuple[2]].getType().equals(TypeCase.FLECHE_DROITE)) {
				if(((Animal) tuple[0]).getClass().equals(Souris.class)) {
					((Animal) tuple[0]).setDirection("droite");
				}
			}
			else if(labyrinthe[ (int) tuple[1]][ (int) tuple[2]].getType().equals(TypeCase.FLECHE_HAUT)) {
				if(((Animal) tuple[0]).getClass().equals(Souris.class)) {
					((Animal) tuple[0]).setDirection("haut");
				}
			}
		}
		for(Object[] tuple : aSupprimer) {
			labyrinthe[ (int) tuple[1]][ (int) tuple[2]].getAnimaux().remove( (Animal) tuple[0]);
		}
		
		
//Ici on remove les souris qui se trouvent sur la meme case qu'un chat et on augmente le compteur de mort d'autant
		for(int y=0; y<this.getHauteur(); y++) {
			for (int x=0; x<this.getLargeur(); x++) {
				if(labyrinthe[x][y].getAnimaux().isEmpty()==false) {
					if (this.getAnimalPlusFort(x, y).getClass().equals(Chat.class) ) {
						for (Iterator<Animal> it = labyrinthe[x][y].getAnimaux().iterator(); it.hasNext();) {
							Animal a = it.next();
							if(a.getClass().equals(Souris.class)) {
								it.remove();
								this.setNbSourisMorte(NbSourisMorte + 1);
							}
						}
					}
				}
			}			
		}	
	}
	
//	Méthode posant une flèche sur un chemin / Modifie la direction si il y en a deja une 
	public void Flecher(int x, int y) {
		if(this.labyrinthe[x][y].getType() == TypeCase.FLECHE_HAUT) {
			this.setTypeCase(x, y, TypeCase.FLECHE_DROITE);
		}
		else if(this.labyrinthe[x][y].getType() == TypeCase.FLECHE_DROITE) {
			this.setTypeCase(x, y, TypeCase.FLECHE_BAS);
		}
		else if(this.labyrinthe[x][y].getType() == TypeCase.FLECHE_BAS) {
			this.setTypeCase(x, y, TypeCase.FLECHE_GAUCHE);
		}
		else if(this.labyrinthe[x][y].getType() == TypeCase.FLECHE_GAUCHE) {
			this.setTypeCase(x, y, TypeCase.CHEMIN);
			this.setNbFlecheUtilisee(NbFlecheUtilisee - 1);
		}
		else if(this.labyrinthe[x][y].getType() == TypeCase.CHEMIN && NbFlecheUtilisee!= NbFlecheMax) {
			this.setTypeCase(x, y, TypeCase.FLECHE_HAUT);
			this.setNbFlecheUtilisee(NbFlecheUtilisee + 1);
		}
		else if(this.labyrinthe[x][y].getType() == TypeCase.FLECHE_HAUT) {
			this.setTypeCase(x, y, TypeCase.FLECHE_DROITE);
		}
	}	
	}
	
	


