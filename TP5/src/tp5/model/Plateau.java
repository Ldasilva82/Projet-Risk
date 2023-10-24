package tp5.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Plateau extends AbstractModel {
	protected ArrayList<Joueur> joueurs;
	protected Territoire[][] plateau;
	protected int hauteur;
	protected int largeur;
	protected int nbTour;
	protected Territoire terSelected;

	public Plateau(int largeur, int hauteur) {
		this.plateau = new Territoire[largeur][hauteur];
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.nbTour = 0;
		this.terSelected = null;
		
		for(int y=0; y<this.getHauteur(); y++) {
			for (int x=0; x<this.getLargeur(); x++) {
				Territoire newTer = new Territoire("test");
				newTer.setType(TypeCase.MER);
				this.plateau[x][y]= newTer;
				System.out.println(x + y +""+ plateau[x][y].getType());
			}
		}
		this.plateau[1][1].setLibellé("Turquie");
		
		Territoire egypte = new Territoire("Egypte");
		egypte.setType(TypeCase.AFRIQUE);
		Territoire afriqueNord = new Territoire("Afrique du Nord");
		afriqueNord.setType(TypeCase.AFRIQUE);
		Territoire afriqueOrientale = new Territoire("Afrique Orientale");
		afriqueOrientale.setType(TypeCase.AFRIQUE);
		Territoire afriqueCentrale = new Territoire("Afrique Centrale");
		afriqueCentrale.setType(TypeCase.AFRIQUE);
		Territoire afriqueSud = new Territoire("Afrique du Sud");
		afriqueSud.setType(TypeCase.AFRIQUE);
		Territoire madagascar = new Territoire("Madagascar");
		madagascar.setType(TypeCase.AFRIQUE);
		
		//------------------Amérique du Nord------------------------
		Territoire alaska = new Territoire("Alaska");
		alaska.setType(TypeCase.AMERIQUE_NORD);
		Territoire territoireNordOuest = new Territoire("Territoire du Nord-Ouest");
		territoireNordOuest.setType(TypeCase.AMERIQUE_NORD);
		Territoire groenland = new Territoire("Groenland");
		groenland.setType(TypeCase.AMERIQUE_NORD);
		Territoire alberta = new Territoire("Alberta");
		alberta.setType(TypeCase.AMERIQUE_NORD);
		Territoire ontario = new Territoire("Ontario");
		ontario.setType(TypeCase.AMERIQUE_NORD);
		Territoire canada = new Territoire("Canada de l'Est");
		canada.setType(TypeCase.AMERIQUE_NORD);
		Territoire euOuest = new Territoire("Etats Unis de l'Ouest");
		euOuest.setType(TypeCase.AMERIQUE_NORD);
		Territoire euEst = new Territoire("Etats Unis de l'Est");
		euEst.setType(TypeCase.AMERIQUE_NORD);
		Territoire ameriqueCentrale = new Territoire("Amérique Centrale");
		ameriqueCentrale.setType(TypeCase.AMERIQUE_NORD);

		//-------------------Amérique du Sud--------------------------
		Territoire venezuela = new Territoire("Vénézuela");
		venezuela.setType(TypeCase.AMERIQUE_SUD);
		Territoire bresil = new Territoire("Brésil");
		bresil.setType(TypeCase.AMERIQUE_SUD);
		Territoire perou = new Territoire("Pérou");
		perou.setType(TypeCase.AMERIQUE_SUD);
		Territoire argentine = new Territoire("Argentine");
		argentine.setType(TypeCase.AMERIQUE_SUD);

		//---------------------------Asie----------------------------
		Territoire oural = new Territoire("Oural");
		oural.setType(TypeCase.ASIE);
		Territoire siberie = new Territoire("Sibérie");
		siberie.setType(TypeCase.ASIE);
		Territoire yakoutie = new Territoire("Yakoutie");
		yakoutie.setType(TypeCase.ASIE);
		Territoire kamchatka = new Territoire("Kamchatka");
		kamchatka.setType(TypeCase.ASIE);
		Territoire irkoutsk = new Territoire("Irkoutsk");
		irkoutsk.setType(TypeCase.ASIE);
		Territoire mongolie = new Territoire("Mongolie");
		mongolie.setType(TypeCase.ASIE);
		Territoire japon = new Territoire("Japon");
		japon.setType(TypeCase.ASIE);
		Territoire afghanistan = new Territoire("Afghanistan");
		afghanistan.setType(TypeCase.ASIE);
		Territoire chine = new Territoire("Chine");
		chine.setType(TypeCase.ASIE);
		Territoire moyenOrient = new Territoire("Moyen-Orient");
		moyenOrient.setType(TypeCase.ASIE);
		Territoire inde = new Territoire("Inde");
		inde.setType(TypeCase.ASIE);
		Territoire asieSudEst = new Territoire("Asie du Sud-Est");
		asieSudEst.setType(TypeCase.ASIE);

		//----------------------Australie-----------------------------
		Territoire indonesie = new Territoire("Indonésie");
		indonesie.setType(TypeCase.INDONESIE);
		Territoire nouvGuinee = new Territoire("Nouvelle Guinée");
		nouvGuinee.setType(TypeCase.NOUVGUINEE);
		Territoire australieOccidentale = new Territoire("Australie Occidentale");
		australieOccidentale.setType(TypeCase.AUSTRALIEOCCIDENTALE);
		Territoire australieOrientale = new Territoire("Australie Orientale");
		australieOrientale.setType(TypeCase.AUSTRALIEORIENTALE);

		//------------------------Europe-----------------------------
		Territoire islande = new Territoire("Islande");
		islande.setType(TypeCase.EUROPE);
		Territoire gb = new Territoire("Grande-Bretagne");
		gb.setType(TypeCase.EUROPE);
		Territoire europeOuest = new Territoire("Europe de l’Ouest");
		europeOuest.setType(TypeCase.EUROPE);
		Territoire europeSud = new Territoire("Europe de Sud");
		europeSud.setType(TypeCase.EUROPE);
		Territoire europeNord = new Territoire("Europe de Nord");
		europeNord.setType(TypeCase.EUROPE);
		Territoire scandinavie = new Territoire("Scandinavie");
		scandinavie.setType(TypeCase.EUROPE);
		Territoire russie = new Territoire("Russie");
		russie.setType(TypeCase.EUROPE);
		
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

		
		plateau[10][8]=egypte;
        plateau[11][8]=egypte;

        plateau[7][8]=afriqueNord;
        plateau[8][8]=afriqueNord;
        plateau[9][8]=afriqueNord;
        plateau[7][9]=afriqueNord;
        plateau[8][9]=afriqueNord;
        plateau[9][9]=afriqueNord;
        plateau[8][10]=afriqueNord;
        plateau[9][10]=afriqueNord;

        plateau[12][8]=afriqueOrientale;
        plateau[10][9]=afriqueOrientale;
        plateau[11][9]=afriqueOrientale;
        plateau[12][9]=afriqueOrientale;
        plateau[10][10]=afriqueOrientale;
        plateau[11][10]=afriqueOrientale;
        plateau[12][10]=afriqueOrientale;
        plateau[10][11]=afriqueOrientale;
        plateau[11][11]=afriqueOrientale;

        plateau[8][11]=afriqueOrientale;
        plateau[9][11]=afriqueCentrale;

        plateau[9][12]=afriqueSud;
        plateau[10][12]=afriqueSud;
        plateau[11][12]=afriqueSud;

        plateau[12][11]=madagascar;
        plateau[12][12]=madagascar;
        
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

	}
	
	

	public int getHauteur() {
		return hauteur;
	}



	public int getLargeur() {
		return largeur;
	}
	
public TypeCase getTypeCase(int x, int y) {
		
		TypeCase type = plateau[x][y].getType();
		
		return type;
		
	}



	public ArrayList<Joueur> setOrdreJoueur(){
		HashMap<Joueur, Integer> resultats = new HashMap<Joueur, Integer>();
        for (Joueur joueur : joueurs) {
            int resultatDe = joueur.lancerDé();
            resultats.put(joueur, resultatDe);
        }
        ArrayList<Joueur> joueursTries = new ArrayList<>(joueurs);
        Collections.sort(joueursTries, (j1, j2) -> Integer.compare(resultats.get(j2), resultats.get(j1)));
        return joueursTries;
	}
	
	public void nouveauTour() {
		if (nbTour==0) {
			this.setOrdreJoueur();
			for (int i=1; i<5; i++) {
				for (Joueur joueur : joueurs) {
					this.placerRegiment(joueur);
					
				}
			}
			
		}
		else {
			for (Joueur joueur : joueurs) {
				
			}
		}
	}
	
	private void placerRegiment(Joueur joueur) {
		this.setTerSelected(null);
		String message = "Sélectionnez un territoire ou ajouter un régiment";
		JOptionPane.showMessageDialog(null, message, "Placer regiment", JOptionPane.INFORMATION_MESSAGE);
		
	}

	public void selectTer(int x, int y) {
		terSelected = this.plateau[x][y];
		System.out.println("pays:"+this.plateau[x][y].getLibellé() );
		System.out.println("voisins:");
		for (Territoire terr : this.plateau[x][y].getTerritVoisins() ) {
			System.out.println(terr.getLibellé());
		}
		System.out.println("--------------");
		
	}


	@Override
	public void setTypeCase(int x, int y, TypeCase tc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Joueur getAnimalPlusFort(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	public Territoire getTerSelected() {
		return terSelected;
	}

	public void setTerSelected(Territoire terSelected) {
		this.terSelected = terSelected;
	}

	@Override
	public boolean partieTerminer() {
		if(nbTour==10) {
			return true;
		}
		else {
			return false;
		}
	}
	
		
}
