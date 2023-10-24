public class Plateau{

	//attributs
	private Continent[] continents;
	private Territoire[][] plateau;
	private int largeur = 18;
	private int hauteur = 13;


	//constructor
	public Plateau(){
		//Création des continents 
		continents = new Continent[6];
		continents[1] = new Continent("Afrique", 3);
		continents[2] = new Continent("Amérique du Nord", 5);
		continents[3] = new Continent("Amérique du Sud", 2);
		continents[4] = new Continent("Asie", 7);
		continents[5] = new Continent("Europe", 5);
		continents[6] = new Continent("Australie", 2);

		//Création des territoires
		//------------------------Afrique-----------------------------
		Territoire egypte = new Territoire("Egypte");
		Territoire afriqueNord = new Territoire("Afrique du Nord");
		Territoire afriqueOrientale = new Territoire("Afrique Orientale");
		Territoire afriqueCentrale = new Territoire("Afrique Centrale");
		Territoire afriqueSud = new Territoire("Afrique du Sud");
		Territoire madagascar = new Territoire("Madagascar");
		//-------------------Amérique du Nord-------------------------
		Territoire alaska = new Territoire("Alaska");
		Territoire territoireNordOuest = new Territoire("Territoire du Nord-Ouest");
		Territoire groenland = new Territoire("Groenland");
		Territoire alberta = new Territoire("Alberta");
		Territoire ontario = new Territoire("Ontario");
		Territoire canada = new Territoire("Canada de l'Est");
		Territoire euOuest = new Territoire("Etats Unis de l'Ouest");
		Territoire euEst = new Territoire("Etats Unis de l'Est");
		Territoire ameriqueCentrale = new Territoire("Amérique Centrale");
		//-------------------Amérique du Sud--------------------------
		Territoire venezuela = new Territoire("Vénézuela");
		Territoire bresil = new Territoire("Brésil");
		Territoire perou = new Territoire("Pérou");
		Territoire argentine = new Territoire("Argentine");
		//---------------------------Asie----------------------------
		Territoire oural = new Territoire("Oural");
		Territoire siberie = new Territoire("Sibérie");
		Territoire yakoutie = new Territoire("Yakoutie");
		Territoire kamchatka = new Territoire("Kamchatka");
		Territoire irkoutsk = new Territoire("Irkoutsk");
		Territoire mongolie = new Territoire("Mongolie");
		Territoire japon = new Territoire("Japon");
		Territoire afghanistan = new Territoire("Afghanistan");
		Territoire chine = new Territoire("Chine");
		Territoire moyenOrient = new Territoire("Moyen-Orient");
		Territoire inde = new Territoire("Inde");
		Territoire asieSudEst = new Territoire("Asie du Sud-Est");
		//----------------------Australie-----------------------------
		Territoire indonesie = new Territoire("Indonésie");
		Territoire nouvGuinee = new Territoire("Nouvelle Guinée");
		Territoire australieOccidentale = new Territoire("Australie Occidentale");
		Territoire australieOrientale = new Territoire("Australie Orientale");
		//------------------------Europe-----------------------------
		Territoire islande = new Territoire("Islande");
		Territoire gb = new Territoire("Grande-Bretagne");
		Territoire europeOuest = new Territoire("Europe de l’Ouest");
		Territoire europeSud = new Territoire("Europe de Sud");
		Territoire europeNord = new Territoire("Europe de Nord");
		Territoire scandinavie = new Territoire("Scandinavie");
		Territoire russie = new Territoire("Russie");
		
		//Intégration des territoires dans les continents

		//-----------------------Afrique-----------------------------
		continents[1].setList(new Territoire[] {egypte, afriqueNord, afriqueOrientale, afriqueCentrale, afriqueSud, madagascar});
		//------------------Amérique du Nord-------------------------
		continents[2].setList(new Territoire[] {alaska, territoireNordOuest, groenland, alberta, ontario, canada, euOuest, euEst, ameriqueCentrale});
		//-------------------Amérique du Sud-------------------------
		continents[3].setList( new Territoire[] {venezuela, bresil, perou, argentine});
		//-------------------------Asie------------------------------
		continents[4].setList(new Territoire[] {oural,siberie,yakoutie,kamchatka,irkoutsk,mongolie,japon,afghanistan,chine,moyenOrient,inde,asieSudEst});
		//------------------------Europe-----------------------------
		continents[5].setList(new Territoire[] {islande,gb,europeOuest,europeSud,europeNord,scandinavie,russie});
		//-----------------------Australie---------------------------
		continents[6].setList(new Territoire[] {indonesie,nouvGuinee,australieOccidentale,australieOrientale});

		//Intégration des listes de territoires voisins par territoires
		//-----------------------Afrique-----------------------------
		egypte.setVoisins(new Territoire[] {afriqueNord, afriqueOrientale, moyenOrient, europeSud});
		afriqueNord.setVoisins(new Territoire[] {egypte, afriqueOrientale, afriqueCentrale, bresil, europeOuest, europeSud});
		afriqueOrientale.setVoisins(new Territoire[] {egypte, afriqueNord, afriqueCentrale, afriqueSud, madagascar, moyenOrient});
		afriqueCentrale.setVoisins(new Territoire[] {afriqueSud, afriqueOrientale, afriqueNord});
		afriqueSud.setVoisins(new Territoire[] {afriqueCentrale, afriqueOrientale, madagascar});
		madagascar.setVoisins(new Territoire[] {afriqueOrientale, afriqueSud});
		//------------------Amérique du Nord-------------------------
		alaska.setVoisins(new Territoire[] {territoireNordOuest, alberta, kamchatka});
		territoireNordOuest.setVoisins(new Territoire[] {alaska, alberta, ontario, groenland});
		groenland.setVoisins(new Territoire[] {territoireNordOuest, ontario, canada, islande});
		alberta.setVoisins(new Territoire[] {alaska, territoireNordOuest, ontario, euOuest});
		ontario.setVoisins(new Territoire[] {groenland, canada, euEst, euOuest, alberta, territoireNordOuest});
		canada.setVoisins(new Territoire[] {groenland, ontario, euEst});
		euOuest.setVoisins(new Territoire[] {alberta, ontario, euEst, ameriqueCentrale});
		euEst.setVoisins(new Territoire[] {euOuest, ontario, canada, ameriqueCentrale});
		ameriqueCentrale.setVoisins(new Territoire[] {euOuest, euEst, venezuela});
		//-------------------Amérique du Sud-------------------------
		venezuela.setVoisins(new Territoire[] {bresil, perou, ameriqueCentrale});
		bresil.setVoisins(new Territoire[] {venezuela, perou, argentine, afriqueNord});
		perou.setVoisins(new Territoire[] {venezuela, bresil, argentine});
		argentine.setVoisins(new Territoire[] {perou, bresil});
		//------------------------Asie-------------------------------
		oural.setVoisins(new Territoire[] {siberie, chine, afghanistan, russie});
		siberie.setVoisins(new Territoire[] {yakoutie, irkoutsk, mongolie, chine, oural});
		yakoutie.setVoisins(new Territoire[] {kamchatka, irkoutsk, siberie});
		kamchatka.setVoisins(new Territoire[] {yakoutie, irkoutsk, mongolie, japon, alaska});
		irkoutsk.setVoisins(new Territoire[] {yakoutie, kamchatka, mongolie, siberie});
		mongolie.setVoisins(new Territoire[] {irkoutsk, kamchatka, japon, chine, siberie});
		japon.setVoisins(new Territoire[] {kamchatka, mongolie});
		afghanistan.setVoisins(new Territoire[] {oural, chine, inde, moyenOrient, russie});
		chine.setVoisins(new Territoire[] {siberie, mongolie, asieSudEst, inde, afghanistan, oural});
		moyenOrient.setVoisins(new Territoire[] {afghanistan, inde, afriqueOrientale, egypte, europeSud, russie});
		inde.setVoisins(new Territoire[] {moyenOrient, afghanistan, chine, asieSudEst});
		asieSudEst.setVoisins(new Territoire[] {inde, chine, indonesie});
		//------------------------Europe-----------------------------
		islande.setVoisins(new Territoire[] {scandinavie, gb, groenland});
		gb.setVoisins(new Territoire[] {islande, scandinavie, europeNord, europeOuest});
		europeOuest.setVoisins(new Territoire[] {europeSud, europeNord, gb, afriqueNord});
		europeSud.setVoisins(new Territoire[] {europeOuest, europeNord, russie, moyenOrient, egypte, afriqueNord});
		europeNord.setVoisins(new Territoire[] {gb, scandinavie, russie, europeSud, europeOuest});
		scandinavie.setVoisins(new Territoire[] {islande, gb, europeNord, russie});
		russie.setVoisins(new Territoire[] {scandinavie, europeNord, europeSud, moyenOrient, afghanistan, oural});
		//------------------------Australie--------------------------
		indonesie.setVoisins(new Territoire[] {asieSudEst, nouvGuinee, australieOccidentale});
		nouvGuinee.setVoisins(new Territoire[] {indonesie, australieOrientale});
		australieOccidentale.setVoisins(new Territoire[] {indonesie, australieOrientale});
		australieOrientale.setVoisins(new Territoire[] {australieOccidentale, nouvGuinee});

		//Initialiser le plateau
		Territoire[][] plateau = new Territoire[largeur][hauteur];
		
        // Initialisation du plateau avec les territoires  : mer
        for (int x = 0; x < largeur; x++) {
            for (int y = 0; y < hauteur; y++) {
            	if(y == 0 || y == 13 
            			|| (y > 2 && (x == 0) ||(y == 0 || y>1) && (x == 18))
            			|| (y == 1 || y > 5)&&(x == 1))
                plateau[x][y] = TypeTerritoire.MER;
            }
        }

		// Affecter des cases à des territoires
		//-----------------------Afrique-----------------------------
        plateau[10][8]= egypte;
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

        plateau[8][11] = afriqueOrientale;
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
	}

    //Méthodes
	public Continent[] getContinents() {
        return continents;
    }

    public void setContinents(Continent[] continents) {
        this.continents = continents;
    }

    public Territoire[][] getPlateau() {
        return plateau;
    }

    public void setPlateau(Territoire[][] plateau) {
        this.plateau = plateau;
    }
}