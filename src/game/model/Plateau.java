package game.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Plateau extends AbstractModel {
	// Attributes
	protected ArrayList<Joueur> joueurs;
	protected Territoire[][] plateau;
	protected ArrayList<Territoire> listeTerritoires;
	protected int hauteur;
	protected int largeur;
	protected int nbTour;
	protected Territoire selectedTerritoire;
	private Continent continent;
	private int nbEchange;
	private ArrayList<Carte> deck;
	protected Scanner scanner;

	// Constructor
	public Plateau(int largeur, int hauteur) {
		this.plateau = new Territoire[largeur][hauteur];
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.nbTour = 0;
		this.selectedTerritoire = null;
		this.joueurs = new ArrayList<Joueur>();
		this.listeTerritoires = new ArrayList<Territoire>();
		this.scanner = new Scanner(System.in);		
		
		for(int y=0; y<this.getHauteur(); y++) {
			for (int x=0; x<this.getLargeur(); x++) {
				Territoire newTer = new Territoire("test");
				newTer.setType(TypeCase.MER);
				this.plateau[x][y]= newTer;
			}
		}
		
		Joueur chat1 = new Joueur("jose", "Luis");
		Joueur chat2 = new Joueur("Nicolas", "Anelka");
		this.getJoueurs().add(chat1);
		this.getJoueurs().add(chat2);
		//------------------Amérique du Nord------------------------
				Territoire egypte = new Territoire("Egypte");
				egypte.setType(TypeCase.EGYPTE);
				listeTerritoires.add(egypte);
				Territoire afriqueNord = new Territoire("Afrique du Nord");
				afriqueNord.setType(TypeCase.AFRIQUENORD);
				listeTerritoires.add(afriqueNord);
				Territoire afriqueOrientale = new Territoire("Afrique Orientale");
				afriqueOrientale.setType(TypeCase.AFRIQUEORIENTALE);
				listeTerritoires.add(afriqueOrientale);
				Territoire afriqueCentrale = new Territoire("Afrique Centrale");
				afriqueCentrale.setType(TypeCase.AFRIQUECENTRALE);
				listeTerritoires.add(afriqueCentrale);
				Territoire afriqueSud = new Territoire("Afrique du Sud");
				afriqueSud.setType(TypeCase.AFRIQUESUD);
				listeTerritoires.add(afriqueSud);
				Territoire madagascar = new Territoire("Madagascar");
				madagascar.setType(TypeCase.MADAGASCAR);
				listeTerritoires.add(madagascar);
				
				//------------------Amérique du Nord------------------------
				Territoire alaska = new Territoire("Alaska");
				alaska.setType(TypeCase.ALASKA);
				listeTerritoires.add(alaska);
				Territoire territoireNordOuest = new Territoire("Territoire du Nord-Ouest");
				territoireNordOuest.setType(TypeCase.NORDOUEST);
				listeTerritoires.add(territoireNordOuest);
				Territoire groenland = new Territoire("Groenland");
				groenland.setType(TypeCase.GROENLAND);
				listeTerritoires.add(groenland);
				Territoire alberta = new Territoire("Alberta");
				alberta.setType(TypeCase.ALBERTA);
				listeTerritoires.add(alberta);
				Territoire ontario = new Territoire("Ontario");
				ontario.setType(TypeCase.ONTARIO);
				listeTerritoires.add(ontario);
				Territoire canada = new Territoire("Canada de l'Est");
				canada.setType(TypeCase.CANADA);
				listeTerritoires.add(canada);
				Territoire euOuest = new Territoire("Etats Unis de l'Ouest");
				euOuest.setType(TypeCase.USAWEST);
				listeTerritoires.add(euOuest);
				Territoire euEst = new Territoire("Etats Unis de l'Est");
				euEst.setType(TypeCase.USAEST);
				listeTerritoires.add(euEst);
				Territoire ameriqueCentrale = new Territoire("Amérique Centrale");
				ameriqueCentrale.setType(TypeCase.CENTRALE);
				listeTerritoires.add(ameriqueCentrale);

				//-------------------Amérique du Sud--------------------------
				Territoire venezuela = new Territoire("Vénézuela");
				venezuela.setType(TypeCase.VENEZUELA);
				listeTerritoires.add(venezuela);
				Territoire bresil = new Territoire("Brésil");
				bresil.setType(TypeCase.BRESIL);
				listeTerritoires.add(bresil);
				Territoire perou = new Territoire("Pérou");
				perou.setType(TypeCase.PEROU);
				listeTerritoires.add(perou);
				Territoire argentine = new Territoire("Argentine");
				argentine.setType(TypeCase.ARGENTINE);
				listeTerritoires.add(argentine);

				//---------------------------Asie----------------------------
				Territoire oural = new Territoire("Oural");
				oural.setType(TypeCase.OURAL);
				listeTerritoires.add(oural);
				Territoire siberie = new Territoire("Sibérie");
				siberie.setType(TypeCase.SIBERIE);
				listeTerritoires.add(siberie);
				Territoire yakoutie = new Territoire("Yakoutie");
				yakoutie.setType(TypeCase.YAKOUTIE);
				listeTerritoires.add(yakoutie);
				Territoire kamchatka = new Territoire("Kamchatka");
				kamchatka.setType(TypeCase.KAMCHATKA);
				listeTerritoires.add(kamchatka);
				Territoire irkoutsk = new Territoire("Irkoutsk");
				irkoutsk.setType(TypeCase.IRKOUTSK);
				listeTerritoires.add(irkoutsk);
				Territoire mongolie = new Territoire("Mongolie");
				mongolie.setType(TypeCase.MONGOLIE);
				listeTerritoires.add(mongolie);
				Territoire japon = new Territoire("Japon");
				japon.setType(TypeCase.JAPON);
				listeTerritoires.add(japon);
				Territoire afghanistan = new Territoire("Afghanistan");
				afghanistan.setType(TypeCase.AFGHANISTAN);
				listeTerritoires.add(afghanistan);
				Territoire chine = new Territoire("Chine");
				chine.setType(TypeCase.CHINE);
				listeTerritoires.add(chine);
				Territoire moyenOrient = new Territoire("Moyen-Orient");
				moyenOrient.setType(TypeCase.MOYENORIENT);
				listeTerritoires.add(moyenOrient);
				Territoire inde = new Territoire("Inde");
				inde.setType(TypeCase.INDE);
				listeTerritoires.add(inde);
				Territoire asieSudEst = new Territoire("Asie du Sud-Est");
				asieSudEst.setType(TypeCase.ASIESUDEST);
				listeTerritoires.add(asieSudEst);

				//----------------------Australie-----------------------------
				Territoire indonesie = new Territoire("Indonésie");
				indonesie.setType(TypeCase.INDONESIE);
				listeTerritoires.add(indonesie);
				Territoire nouvGuinee = new Territoire("Nouvelle Guinée");
				nouvGuinee.setType(TypeCase.NOUVGUINEE);
				listeTerritoires.add(nouvGuinee);
				Territoire australieOccidentale = new Territoire("Australie Occidentale");
				australieOccidentale.setType(TypeCase.AUSTRALIEOCCIDENTALE);
				listeTerritoires.add(australieOccidentale);
				Territoire australieOrientale = new Territoire("Australie Orientale");
				australieOrientale.setType(TypeCase.AUSTRALIEORIENTALE);
				listeTerritoires.add(australieOrientale);
				//------------------------Europe-----------------------------
				Territoire islande = new Territoire("Islande");
				islande.setType(TypeCase.ISLANDE);
				listeTerritoires.add(islande);
				Territoire gb = new Territoire("Grande-Bretagne");
				gb.setType(TypeCase.GRANDEBRETAGNE);
				listeTerritoires.add(gb);
				Territoire europeOuest = new Territoire("Europe de l'Ouest");
				europeOuest.setType(TypeCase.EUROPEOUEST);
				listeTerritoires.add(europeOuest);
				Territoire europeSud = new Territoire("Europe de Sud");
				europeSud.setType(TypeCase.EUROPESUD);
				listeTerritoires.add(europeSud);
				Territoire europeNord = new Territoire("Europe de Nord");
				europeNord.setType(TypeCase.EUROPENORD);
				listeTerritoires.add(europeNord);
				Territoire scandinavie = new Territoire("Scandinavie");
				scandinavie.setType(TypeCase.SCANDINAVIE);
				listeTerritoires.add(scandinavie);
				Territoire russie = new Territoire("Russie");
				russie.setType(TypeCase.RUSSIE);
				listeTerritoires.add(russie);
		
		//-------------Afrique---------------
		egypte.setTerritVoisins(new Territoire[] {afriqueNord, afriqueOrientale, moyenOrient, europeSud});
		afriqueNord.setTerritVoisins(new Territoire[] {egypte, afriqueOrientale, afriqueCentrale, bresil, europeOuest, europeSud});
		afriqueOrientale.setTerritVoisins(new Territoire[] {egypte, afriqueNord, afriqueCentrale, afriqueSud, madagascar, moyenOrient});
		afriqueCentrale.setTerritVoisins(new Territoire[] {afriqueSud, afriqueOrientale, afriqueNord});
		afriqueSud.setTerritVoisins(new Territoire[] {afriqueCentrale, afriqueOrientale, madagascar});
		madagascar.setTerritVoisins(new Territoire[] {afriqueOrientale, afriqueSud});
		
		//------------Amérique du Nord-----------
		alaska.setTerritVoisins(new Territoire[] {territoireNordOuest, alberta, kamchatka});
		territoireNordOuest.setTerritVoisins(new Territoire[] {alaska, alberta, ontario, groenland});
		groenland.setTerritVoisins(new Territoire[] {territoireNordOuest, ontario, canada, islande});
		alberta.setTerritVoisins(new Territoire[] {alaska, territoireNordOuest, ontario, euOuest});
		ontario.setTerritVoisins(new Territoire[] {groenland, canada, euEst, euOuest, alberta, territoireNordOuest});
		canada.setTerritVoisins(new Territoire[] {groenland, ontario, euEst});
		euOuest.setTerritVoisins(new Territoire[] {alberta, ontario, euEst, ameriqueCentrale});
		euEst.setTerritVoisins(new Territoire[] {euOuest, ontario, canada, ameriqueCentrale});
		ameriqueCentrale.setTerritVoisins(new Territoire[] {euOuest, euEst, venezuela});
		
		//-----------Amérique du Sud--------------
		venezuela.setTerritVoisins(new Territoire[] {bresil, perou, ameriqueCentrale});
		bresil.setTerritVoisins(new Territoire[] {venezuela, perou, argentine, afriqueNord});
		perou.setTerritVoisins(new Territoire[] {venezuela, bresil, argentine});
		argentine.setTerritVoisins(new Territoire[] {perou, bresil});
		
		//-----------Europe-------------------
		islande.setTerritVoisins(new Territoire[] {scandinavie, gb, groenland});
		gb.setTerritVoisins(new Territoire[] {islande, scandinavie, europeNord, europeOuest});
		europeOuest.setTerritVoisins(new Territoire[] {europeSud, europeNord, gb, afriqueNord});
		europeSud.setTerritVoisins(new Territoire[] {europeOuest, europeNord, russie, moyenOrient, egypte, afriqueNord});
		europeNord.setTerritVoisins(new Territoire[] {gb, scandinavie, russie, europeSud, europeOuest});
		scandinavie.setTerritVoisins(new Territoire[] {islande, gb, europeNord, russie});
		russie.setTerritVoisins(new Territoire[] {scandinavie, europeNord, europeSud, moyenOrient, afghanistan, oural});
		
		//-----------Asie-------------------
		oural.setTerritVoisins(new Territoire[] {siberie, chine, afghanistan, russie});
		siberie.setTerritVoisins(new Territoire[] {yakoutie, irkoutsk, mongolie, chine, oural});
		yakoutie.setTerritVoisins(new Territoire[] {kamchatka, irkoutsk, siberie});
		kamchatka.setTerritVoisins(new Territoire[] {yakoutie, irkoutsk, mongolie, japon, alaska});
		irkoutsk.setTerritVoisins(new Territoire[] {yakoutie, kamchatka, mongolie, siberie});
		mongolie.setTerritVoisins(new Territoire[] {irkoutsk, kamchatka, japon, chine, siberie});
		japon.setTerritVoisins(new Territoire[] {kamchatka, mongolie});
		afghanistan.setTerritVoisins(new Territoire[] {oural, chine, inde, moyenOrient, russie});
		chine.setTerritVoisins(new Territoire[] {siberie, mongolie, asieSudEst, inde, afghanistan, oural});
		moyenOrient.setTerritVoisins(new Territoire[] {afghanistan, inde, afriqueOrientale, egypte, europeSud, russie});
		inde.setTerritVoisins(new Territoire[] {moyenOrient, afghanistan, chine, asieSudEst});
		asieSudEst.setTerritVoisins(new Territoire[] {inde, chine, indonesie});
		
		//--------------Australie----------------
		indonesie.setTerritVoisins(new Territoire[] {asieSudEst, nouvGuinee, australieOccidentale});
		nouvGuinee.setTerritVoisins(new Territoire[] {indonesie, australieOrientale});
		australieOccidentale.setTerritVoisins(new Territoire[] {indonesie, australieOrientale});
		australieOrientale.setTerritVoisins(new Territoire[] {australieOccidentale, nouvGuinee});

		// Affecter des cases à des territoires
				//-----------------------Afrique-----------------------------
		plateau[10][8] = egypte;
        plateau[11][8] = egypte;

        plateau[7][8] = afriqueNord;
        plateau[8][8] = afriqueNord;
        plateau[9][8] = afriqueNord;
        plateau[7][9] = afriqueNord;
        plateau[8][9] = afriqueNord;
        plateau[9][9] = afriqueNord;
        plateau[8][10] = afriqueNord;
        plateau[9][10] = afriqueNord;

        plateau[12][8] = afriqueOrientale;
        plateau[10][9] = afriqueOrientale;
        plateau[11][9] = afriqueOrientale;
        plateau[12][9] = afriqueOrientale;
        plateau[10][10] = afriqueOrientale;
        plateau[11][10] = afriqueOrientale;
        plateau[12][10] = afriqueOrientale;
        plateau[10][11] = afriqueOrientale;
        plateau[11][11] = afriqueOrientale;

        plateau[8][11] = afriqueCentrale;
        plateau[9][11] = afriqueCentrale;

        plateau[9][12] = afriqueSud;
        plateau[10][12] = afriqueSud;
        plateau[11][12] = afriqueSud;

        plateau[12][11] = madagascar;
        plateau[12][12] = madagascar;
        
      //------------------Amérique du Nord-------------------------
        plateau[0][1] = alaska;
        plateau[0][2] = alaska;
        plateau[18][1] = alaska;

        plateau[1][1] = territoireNordOuest;
        plateau[2][1] = territoireNordOuest;
        plateau[3][1] = territoireNordOuest;

        plateau[4][1] = groenland;
        plateau[5][1] = groenland;
        plateau[4][2] = groenland;
        plateau[5][2] = groenland;

        plateau[1][2] = alberta;
        plateau[1][3] = alberta;

        plateau[2][2] = ontario;
        plateau[3][2] = ontario;
        plateau[2][3] = ontario;
        plateau[3][3] = ontario;

        plateau[4][3] = canada;

        plateau[1][4] = euOuest;
        plateau[2][4] = euOuest;

        plateau[3][4] = euEst;
        plateau[4][4] = euEst;
        plateau[3][5] = euEst;
        plateau[4][5] = euEst;

        plateau[2][5] = ameriqueCentrale;
        plateau[2][6] = ameriqueCentrale;
        plateau[2][7] = ameriqueCentrale;

        //-------------------Amérique du Sud-------------------------
        plateau[2][8] = venezuela;
        plateau[3][8] = venezuela;

        plateau[3][9] = bresil;
        plateau[4][9] = bresil;
        plateau[5][9] = bresil;
        plateau[6][9] = bresil;
        plateau[3][10] = bresil;
        plateau[4][10] = bresil;
        plateau[5][10] = bresil;
        plateau[5][11] = bresil;

        plateau[2][9] = perou;

        plateau[2][10] = argentine;
        plateau[2][11] = argentine;
        plateau[3][11] = argentine;
        plateau[4][11] = argentine;
        plateau[3][12] = argentine;
        plateau[4][12] = argentine;

        //------------------------Asie-------------------------------
        plateau[13][2] = oural;
        plateau[13][3] = oural;
        plateau[13][4] = oural;
        plateau[13][5] = oural;

        plateau[14][1] = siberie;
        plateau[14][2] = siberie;
        plateau[14][3] = siberie;
        plateau[14][4] = siberie;

        plateau[15][1] = yakoutie;

        plateau[16][1] = kamchatka;
        plateau[17][1] = kamchatka;
        plateau[16][2] = kamchatka;

        plateau[15][2] = irkoutsk;

        plateau[15][3] = mongolie;
        plateau[16][3] = mongolie;
        plateau[15][4] = mongolie;
        plateau[16][4] = mongolie;

        plateau[17][2] = japon;
        plateau[17][3] = japon;

        plateau[12][6] = afghanistan;
        plateau[13][6] = afghanistan;

        plateau[14][5] = chine;
        plateau[15][5] = chine;
        plateau[16][5] = chine;
        plateau[14][6] = chine;
        plateau[15][6] = chine;
        plateau[16][6] = chine;
        plateau[15][7] = chine;

        plateau[11][7] = moyenOrient;
        plateau[12][7] = moyenOrient;

        plateau[13][7] = inde;
        plateau[14][7] = inde;
        plateau[14][8] = inde;
        plateau[14][9] = inde;

        plateau[15][8] = asieSudEst;
        plateau[15][9] = asieSudEst;

        //------------------------Europe-----------------------------
        plateau[6][2] = islande;
        plateau[7][2] = islande;

        plateau[6][3] = gb;
        plateau[7][3] = gb;
        plateau[8][3] = gb;

        plateau[7][4] = europeOuest;
        plateau[7][5] = europeOuest;
        plateau[8][5] = europeOuest;
        plateau[7][6] = europeOuest;
        plateau[8][6] = europeOuest;
        plateau[7][7] = europeOuest;
        plateau[8][7] = europeOuest;

        plateau[9][6] = europeSud;
        plateau[10][6] = europeSud;
        plateau[9][7] = europeSud;
        plateau[10][7] = europeSud;

        plateau[8][4] = europeNord;
        plateau[9][4] = europeNord;
        plateau[10][4] = europeNord;
        plateau[9][5] = europeNord;
        plateau[10][5] = europeNord;

        plateau[8][2] = scandinavie;
        plateau[9][2] = scandinavie;
        plateau[10][2] = scandinavie;
        plateau[9][3] = scandinavie;
        plateau[10][3] = scandinavie;

        plateau[11][2] = russie;
        plateau[12][2] = russie;
        plateau[11][3] = russie;
        plateau[12][3] = russie;
        plateau[11][4] = russie;
        plateau[12][4] = russie;
        plateau[11][5] = russie;
        plateau[12][5] = russie;
        plateau[11][6] = russie;

        //------------------------Australie--------------------------
        plateau[16][9] = indonesie;

        plateau[17][9] = nouvGuinee;

        plateau[16][10] = australieOccidentale;
        plateau[16][11] = australieOccidentale;

        plateau[17][10] = australieOrientale;
        plateau[17][11] = australieOrientale;
        
        
       //Création des continents avec les gains de régiments
        Continent afrique = new Continent("Afrique", 3);
        Continent ameriqueNord = new Continent("Amérique du Nord", 5);
        Continent ameriqueSud = new Continent("Amérique du Sud", 2);
        Continent asie = new Continent("Asie", 7);
        Continent europe = new Continent("Europe", 5);
        Continent australie = new Continent("Australie", 2);
      

      	//Affecter les territoires dans des continents
        afrique.setTerritoiresList(new Territoire[] {egypte, afriqueNord, afriqueOrientale, afriqueCentrale, afriqueSud, madagascar});
        ameriqueNord.setTerritoiresList(new Territoire[] {alaska, territoireNordOuest, groenland, alberta, ontario, canada, euOuest, euEst, ameriqueCentrale});
        ameriqueSud.setTerritoiresList(new Territoire[]{venezuela, bresil, perou, argentine});
        asie.setTerritoiresList(new Territoire[] {oural, siberie, yakoutie, kamchatka, irkoutsk, mongolie, japon, afghanistan, chine, moyenOrient, inde, asieSudEst});
        europe.setTerritoiresList(new Territoire[] {islande, gb, europeOuest, europeSud, europeNord, scandinavie, russie});
        australie.setTerritoiresList(new Territoire[] {indonesie, nouvGuinee, australieOccidentale, australieOrientale});
        

	}
	
	
	// Methods 
	//------------------------Getters--------------------------
	public ArrayList<Joueur> getJoueurs() {
		return joueurs;
	}
	
	public int getHauteur() {
		return hauteur;
	}

	public int getLargeur() {
		return largeur;
	}
	
	public Territoire getTerritoire(int x, int y) {
		return this.plateau[x][y];
	}
	
	public TypeCase getTypeCase(int x, int y) {
		TypeCase type = plateau[x][y].getType();
		
		return type;
	}
	
	public Territoire getTerSelected() {
		return selectedTerritoire;
	}
	
	public ArrayList<Joueur> getOrdreJoueur(){
    	return joueurs;
    }
	
	public ArrayList<Carte> getDeck(){
		return this.deck;
	}
	
	public int getNbTour() {
		return nbTour;
	}
	
//	méthode qui prend en paramètre le NomTerritoire et renvoit l'objet Territoire auquel il correspond
	public Territoire trouverTerritoireParNom(String territoireChoisi) {
		Territoire retour = null;
		for (Territoire territoire : listeTerritoires) {
			if (territoire.getNomTerritoire().equals(territoireChoisi)) {
				retour = territoire;
			}
		}
		return retour;
	}
	
	//------------------------Setters--------------------------
	@Override
	public void setTypeCase(int x, int y, TypeCase tc) {
		// TODO Auto-generated method stub
		
	}
	
	public void setTerritoireSelected(Territoire terSelected) {
		this.selectedTerritoire = terSelected;
	}
	
	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
	}
	
	public ArrayList<Joueur> setOrdreJoueur(){
		HashMap<Joueur, Integer> resultats = new HashMap<Joueur, Integer>();
        for (Joueur joueur : joueurs) {
            int resultatDe = joueur.lancerDes();
            resultats.put(joueur, resultatDe);
        }
        ArrayList<Joueur> joueursTries = new ArrayList<>(joueurs);
        Collections.sort(joueursTries, (j1, j2) -> Integer.compare(resultats.get(j2), resultats.get(j1)));
        return joueursTries;
	}
	
	//------------------------Others--------------------------
	public void Deck() {
		Carte carte = new Carte();
		carte.combineLists();
	}
	
	public void nouveauTour() {
		if (nbTour==0) {
			this.setOrdreJoueur();
			for (int i=1; i<25; i++) {
				for (Joueur joueur : joueurs) {
					this.placerRegiment(joueur);
					
				}
			}
			this.setNbTour(getNbTour()+1);
		}
		else {
			for (Joueur joueur : joueurs) {
				this.attaquer(joueur);
				this.deplacer(joueur);
				
			}
			this.setNbTour(getNbTour()+1);
		}
	}
	
//	Cette méthode gère le placement des régiments d'un joueur
	private void placerRegiment(Joueur joueur) {
		if (this.territoireLibre()) {
			
			System.out.println(joueur.getNomJoueur() + "Sélectionnez un territoire où ajouter un régiment:");
			for (Territoire territoire : listeTerritoires) {
				if (territoire.getProprietaire()==null) {
					System.out.println(territoire.getNomTerritoire());
				}
		    }
			String territoireChoisi = this.scanner.nextLine();
			Territoire territoireSelectionne = trouverTerritoireParNom(territoireChoisi);
			territoireSelectionne.setProprietaire(joueur);
			territoireSelectionne.setNbRegiment("+", 1);

		} 
		else {
			System.out.println(joueur.getNomJoueur() + "Sélectionnez un territoire où ajouter un régiment:");
			for (Territoire territoire : listeTerritoires) {
				if (territoire.getProprietaire().equals(joueur)) {
					System.out.println(territoire.getNomTerritoire());
				}
		    }
			String territoireChoisi = this.scanner.nextLine();
			Territoire territoireSelectionne = trouverTerritoireParNom(territoireChoisi);
			territoireSelectionne.setNbRegiment("+", 1);
			
		}
	}
	
//	Cette méthode gère une phase d'attaque d'un Joueur
	public void attaquer(Joueur joueur) {
//		choix attaque ou pas
		System.out.println(joueur.getNomJoueur() + "Voulez vous effectuer une attaque? Oui/Non");
		String choixAttaque = this.scanner.nextLine();
		
//		Cas ou le joueur répond Oui
		if (choixAttaque.equals("Oui")) {
//			choix attaquant
			System.out.println(joueur.getNomJoueur() + "Lequel de vos territoires passe a l'attaque?");
			//on propose tous les territoires disposant d'assez de régiments pour une attaque
			//et ayant des territoires non possédés parmis les voisins
			for (Territoire territoire : listeTerritoires) {
				if (territoire.getProprietaire().equals(joueur)) {
					if (cibleDispo(territoire, joueur)) {
						if (territoire.getNbRegiments()>=2) {
							System.out.println(territoire.getNomTerritoire());
						}
					}
				}
			}
			//le joueur attaquant choisi son territoireAttaquant
			String choixAttaquant = this.scanner.nextLine();
			Territoire territoireAttaquant = trouverTerritoireParNom(choixAttaquant);
			
//			choix cible
			//on propose les territoires voisins non possédés
			System.out.println(joueur.getNomJoueur() + "Quelle est votre cible?");
			for (Territoire terr : territoireAttaquant.getTerritVoisins() ) {
				if (terr.getProprietaire().equals(joueur)) {
				}
				else {
					System.out.println(terr.getNomTerritoire());
				}
			}
			//le joueur attaquant choisit le territoireCible
			String choixCible = this.scanner.nextLine();
			Territoire territoireCible = trouverTerritoireParNom(choixCible);
			//le propriétaire de territoireCible est stocké dans "defenseur"
			Joueur defenseur = territoireCible.getProprietaire();
			
//			choix nb unités engagées (coté attaquant)
			String choixNb = null;
			//On propose différents choix selon le nombre de régiments a disposition (il faut qu'il en reste 1 au moins)
			if (territoireAttaquant.getNbRegiments()>=4) {
				System.out.println(joueur.getNomJoueur() + "combien de regiments se battront? 1/2/3");
				choixNb = this.scanner.nextLine();
			}
			else if (territoireAttaquant.getNbRegiments()==3) {
				System.out.println(joueur.getNomJoueur() + "combien de regiments se battront? 1/2");
				choixNb = this.scanner.nextLine();
			}
			else if (territoireAttaquant.getNbRegiments()==2) {
				choixNb = "1";
			}
			//transformation du choix en Integer
			int numAttaquant = Integer.parseInt(choixNb);
			
			
//			choix nb unités engagées (coté defense)
			String choixNbDefense = null;
			//On propose différents choix selon le nombre de régiments a disposition
			if (territoireCible.getNbRegiments()>=2) {
				System.out.println(defenseur.getNomJoueur() + "combien de regiments se battront? 1/2");
				choixNbDefense = this.scanner.nextLine();
			}
			else {
				choixNbDefense = "1";
			}
			//transformation du choix en Integer
			int numDefenseur = Integer.parseInt(choixNbDefense);
			
//			determiner gaganant
			int BestAttaquant = 0;
			int BestDefenseur = 0;
			Joueur gagnant = null;
			//on affiche les résultats du lancé de l'attaquant et on stocke son meilleur résultat dans BestAttaquant
			System.out.println("Le joueur attaquant lance, resultats:");
			for (int i=0; i<numAttaquant; i++) {
				int lancer = joueur.lancerDes();
				System.out.println(lancer);
				if (lancer>BestAttaquant) {
					BestAttaquant = lancer;
				}
			}
			//on affiche les résultats du lancé du défenseur et on stocke son meilleur résultat dans BestDefenseur
			System.out.println("Le joueur defenseur lance, resultats:");
			for (int i=0; i<numDefenseur; i++) {
				int lancer = defenseur.lancerDes();
				System.out.println(lancer);
				if (lancer>BestDefenseur) {
					BestDefenseur = lancer;
				}
			}
			//Actualisation des stats des joueurs impliqués et définition du gagnant en fonction du résultat
			if (BestAttaquant>BestDefenseur) {
				System.out.println("Le joueur attaquant a gagné");	
				joueur.setNbAttaqueReussie(joueur.getNbAttaqueReussie()+1);
				gagnant = joueur;
			}
			else {
				System.out.println("Le joueur qui defend a gagné");
				defenseur.setNbDefenseReussie(defenseur.getNbDefenseReussie()+1);
				gagnant = defenseur;
			}
			
//			changer regiment en conséquence
			if (gagnant.equals(defenseur)) {
				territoireAttaquant.setNbRegiment("-", 1);
			}
			else if (gagnant.equals(joueur)) {
				//cas ou il reste des régiments en défense
				if (territoireCible.getNbRegiments()>1) {
					territoireCible.setNbRegiment("-", 1);
				}
				//cas ou c'était le dernier régiment en défense
				else {
					territoireCible.setProprietaire(joueur);
					territoireAttaquant.setNbRegiment("-", 1);
					gagnant.setNbTerritoireConquis(gagnant.getNbTerritoireConquis()+1);
//*
					//piocher carte
//*					
					if (joueurOut(defenseur)) {
//*						
						//récupérer carte du defenseur
//*						
					}
					
					
				}
			}
			
//			demander si on continue d'attaquer
			System.out.println(joueur.getNomJoueur() + "Vous avez le droit de continuer a attaquer (un refus vous feras passer a la phase de déplacement");
			this.attaquer(joueur);
		}
		
//		Cas ou le joueur répond Non 
		else if (choixAttaque.equals("Non")){
			System.out.println(joueur.getNomJoueur() + " choisi de ne pas attaquer");
		}
	}
	
//	Cette méthode gère une phase de déplacement d'un Joueur
	public void deplacer(Joueur joueur) {
		//choix deplacement ou pas
		System.out.println(joueur.getNomJoueur() + "Voulez vous deplacer des regiments? Oui/Non");
		String choixDeplacement = this.scanner.nextLine();
//		Cas ou le joueur répond Oui
		if (choixDeplacement.equals("Oui")) {	
			//choix du territoire de départ
			System.out.println("De quel territoire doivent partir les troupes?");
			for (Territoire territoire : listeTerritoires) {
				if (territoire.getProprietaire().equals(joueur)) {
					if (voisinDispo(territoire, joueur)) {
						if (territoire.getNbRegiments()>=2) {
							System.out.println(territoire.getNomTerritoire());
						}
					}
				}
			}
			String choixDepart = this.scanner.nextLine();
			Territoire territoireDepart = trouverTerritoireParNom(choixDepart);
			
//			Choix de la destination
			//création d'une liste de destination possible en rechercheant les voisins des voisins 
			//jusqu'a ce qu'il n'y ai plus de nouveaux ajouts
			System.out.println("Vers quel territoire doivent partir les troupes?");
			ArrayList<Territoire> destiPossible = new ArrayList<Territoire>();
			for (Territoire voisin : territoireDepart.getTerritVoisins()) {
				if (voisin.getProprietaire().equals(joueur)) {
					destiPossible.add(voisin);
				}
			}
			int ajout = 1;
			while (ajout !=0) {
				ajout=0;
				for (Territoire territoire : destiPossible) {
					for (Territoire voisin : territoire.getTerritVoisins()) {
						if (voisin.getProprietaire().equals(joueur) && !destiPossible.contains(voisin)) {
							destiPossible.add(voisin);
							ajout=ajout+1;
						}
					}
				}
			}
			//print des destinations possibles
			for (Territoire destination : destiPossible) {
				System.out.println(destination.getNomTerritoire());
			}
			String choixArrivee = this.scanner.nextLine();
			Territoire territoireArrivee = trouverTerritoireParNom(choixArrivee);
			
//			choix du nombre d'unités a déplacer
			System.out.println(joueur.getNomJoueur() + "Combien de troupes deplacer? (de 1 a "+ (territoireDepart.getNbRegiments()-1));
			String choixNbTroupe = this.scanner.nextLine();
			int numTroupe = Integer.parseInt(choixNbTroupe);
			
//			déplacement des troupes
			territoireDepart.setNbRegiment("-", numTroupe);
			territoireArrivee.setNbRegiment("+", numTroupe);
		}
	}

	public void afficherInfoSelectedTerr(int x, int y) {
		selectedTerritoire = this.plateau[x][y];
	    
		// Init StringBuilder => pour construire une string complexe
	    StringBuilder infoTerritoire = new StringBuilder();
	    /// Ajout du nom terrriroire
	    infoTerritoire.append("Territoire : \n ").append(selectedTerritoire.getNomTerritoire()).append("\n\n");
	    /// Ajout de la liste des pays voisons 
	    infoTerritoire.append("Voisins :\n");
	    for (Territoire territoire : selectedTerritoire.getTerritVoisins()) {
	        infoTerritoire.append(territoire.getNomTerritoire()).append("\n");
	    }

	    JOptionPane.showMessageDialog(null, infoTerritoire.toString(), "Informations du territoire", JOptionPane.INFORMATION_MESSAGE);
	}
	

//	méthode renvoyant true si au moins un territoire voisin appartient a un autre joueur 
	public boolean cibleDispo(Territoire territoire, Joueur joueur) {
		Territoire cible = null;
		for (Territoire terr : territoire.getTerritVoisins() ) {
			if (terr.getProprietaire().equals(joueur)) {
			}
			else {
				cible = terr;
			}
		}
		if (cible!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	méthode renvoyant true si au moins un territoire voisin appartient au autre joueur 
	public boolean voisinDispo(Territoire territoire, Joueur joueur) {
		Territoire cible = null;
		for (Territoire terr : territoire.getTerritVoisins() ) {
			if (terr.getProprietaire().equals(joueur)) {
				cible = terr;
			}
			else {
			}
		}
		if (cible!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
//	vérifier si il reste des territoires sans propriétaires
	public boolean territoireLibre() {
		Territoire verif = null;
		for (Territoire territoire : listeTerritoires) {
			if (territoire.getProprietaire()==null) {
				verif = territoire;
			}
		}
		if (verif!=null) {
			return true;
		}
		else {
			return false;
		}
	}

	
//	vérifier si un joueur est éliminé
	public boolean joueurOut(Joueur joueur) {
		Territoire verif = null;
		for (Territoire territoire : listeTerritoires) {
			if (territoire.getProprietaire().equals(joueur)) {
				verif = territoire;
			}
		}
		if (verif!=null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	@Override
	public boolean partieTerminer() {
		if(nbTour!=10) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
