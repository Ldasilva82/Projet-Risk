public class Plateau{

	//attributs
	private Continent[] continents;
	private Territoire[][] plateau;
	private int largeur;
	private int hauteur;


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
		continents[1].getList() = new Territoire[] {egypte, afriqueNord, afriqueOrientale, afriqueCentrale, afriqueSud, madagascar};
		//------------------Amérique du Nord-------------------------
		continents[2].getList() = new Territoire[] {alaska, territoireNordOuest, groenland, alberta, ontario, canada, EUOuest, EUEst, ameriqueCentrale};
		//-------------------Amérique du Sud-------------------------
		continents[3].getList() = new Territoire[] {venezuela, bresil, perou, argentine};
		//-------------------------Asie------------------------------
		continents[4].getList() = new Territoire[] {oural,siberie,yakoutie,kamchatka,irkoutsk,mongolie,japon,afghanistan,chine,moyenOrient,inde,asieSudEst};
		//------------------------Europe-----------------------------
		continents[5].getList() = new Territoire[] {islande,gb,europeOuest,europeSud,europeNord,scandinavie,russie};
		//-----------------------Australie---------------------------
		continents[6].getList() = new Territoire[] {indonesie,nouvGuinee,australieOccidentale,australieOrientale};

		continents[1].getList().add(egypte);
		continents[1].getList().add(afriqueNord);
		continents[1].getList().add(afriqueOrientale);
		continents[1].getList().add(afriqueCentrale);
		continents[1].getList().add(afriqueSud);
		continents[1].getList().add(madagascar);
		//------------------Amérique du Nord-------------------------
		continents[2].getList().add(alaska);
		continents[2].getList().add(territoireNordOuest);
		continents[2].getList().add(groenland);
		continents[2].getList().add(alberta);
		continents[2].getList().add(ontario);
		continents[2].getList().add(canada);
		continents[2].getList().add(euOuest);
		continents[2].getList().add(euEst);
		continents[2].getList().add(ameriqueCentrale);
		//-------------------Amérique du Sud-------------------------
		continents[3].getList().add(venezuela);
		continents[3].getList().add(bresil);
		continents[3].getList().add(perou);
		continents[3].getList().add(argentine);
		//------------------------Asie-------------------------------
		continents[4].getList().add(oural);
		continents[4].getList().add(siberie);
		continents[4].getList().add(yakoutie);
		continents[4].getList().add(kamchatka);
		continents[4].getList().add(irkoutsk);
		continents[4].getList().add(mongolie);
		continents[4].getList().add(japon);
		continents[4].getList().add(afghanistan);
		continents[4].getList().add(chine);
		continents[4].getList().add(moyenOrient);
		continents[4].getList().add(inde);
		continents[4].getList().add(asieSudEst);
		//------------------------Europe-----------------------------
		continents[5].getList().add(islande);
		continents[5].getList().add(gb);
		continents[5].getList().add(europeOuest);
		continents[5].getList().add(europeSud);
		continents[5].getList().add(europeNord);
		continents[5].getList().add(scandinavie);
		continents[5].getList().add(russie);
		//------------------------Australie--------------------------
		continents[6].getList().add(indonesie);
		continents[6].getList().add(nouvGuinee);
		continents[6].getList().add(australieOccidentale);
		continents[6].getList().add(australieOrientale);

		//Intégration des listes de territoires voisins par territoires
		//-----------------------Afrique-----------------------------
		egypte.getVoisins() = new Territoire[] {afriqueNord, afriqueOrientale, moyenOrient, europeSud};
		afriqueNord.getVoisins() = new Territoire[] {egypte, afriqueOrientale, afriqueCentrale, bresil, europeOuest, europeSud};
		afriqueOrientale.getVoisins() = new Territoire[] {egypte, afriqueNord, afriqueCentrale, afriqueSud, madagascar, moyenOrient};
		afriqueCentrale.getVoisins() = new Territoire[] {afriqueSud, afriqueOrientale, afriqueNord};
		afriqueSud.getVoisins() = new Territoire[] {afriqueCentrale, afriqueOrientale, madagascar};
		madagascar.getVoisins() = new Territoire[] {afriqueOrientale, afriqueSud};
		//------------------Amérique du Nord-------------------------
		alaska.getVoisins() = new Territoire[] {territoireNordOuest, alberta, kamchatka};
		territoireNordOuest.getVoisins() = new Territoire[] {alaska, alberta, ontario, groenland};
		groenland.getVoisins() = new Territoire[] {territoireNordOuest, ontario, canada, islande};
		alberta.getVoisins() = new Territoire[] {alaska, territoireNordOuest, ontario, euOuest};
		ontario.getVoisins() = new Territoire[] {groenland, canada, euEst, euOuest, alberta, territoireNordOuest};
		canada.getVoisins() = new Territoire[] {groenland, ontario, euEst};
		euOuest.getVoisins() = new Territoire[] {alberta, ontario, euEst, ameriqueCentrale};
		euEst.getVoisins() = new Territoire[] {euOuest, ontario, canada, ameriqueCentrale};
		ameriqueCentrale.getVoisins() = new Territoire[] {euOuest, euEst, venezuela};
		//-------------------Amérique du Sud-------------------------
		venezuela.getVoisins() = new Territoire[] {bresil, perou, ameriqueCentrale};
		bresil.getVoisins() = new Territoire[] {venezuela, perou, argentine, afriqueNord};
		perou.getVoisins() = new Territoire[] {venezuela, bresil, argentine};
		argentine.getVoisins() = new Territoire[] {perou, bresil};
		//------------------------Asie-------------------------------
		oural.getVoisins() = new Territoire[] {siberie, chine, afghanistan, russie};
		siberie.getVoisins() = new Territoire[] {yakoutie, irkoutsk, mongolie, chine, oural};
		yakoutie.getVoisins() = new Territoire[] {kamchatka, irkoutsk, siberie};
		kamchatka.getVoisins() = new Territoire[] {yakoutie, irkoutsk, mongolie, japon, alaska};
		irkoutsk.getVoisins() = new Territoire[] {yakoutie, kamchatka, mongolie, siberie};
		mongolie.getVoisins() = new Territoire[] {irkoutsk, kamchatka, japon, chine, siberie};
		japon.getVoisins() = new Territoire[] {kamchatka, mongolie};
		afghanistan.getVoisins() = new Territoire[] {oural, chine, inde, moyenOrient, russie};
		chine.getVoisins() = new Territoire[] {siberie, mongolie, asieSudEst, inde, afghanistan, oural};
		moyenOrient.getVoisins() = new Territoire[] {afghanistan, inde, afriqueOrientale, egypte, europeSud, russie};
		inde.getVoisins() = new Territoire[] {moyenOrient, afghanistan, chine, asieSudEst};
		asieSudEst.getVoisins() = new Territoire[] {inde, chine, indonesie};
		//------------------------Europe-----------------------------
		islande.getVoisins() = new Territoire[] {scandinavie, gb, groenland};
		gb.getVoisins() = new Territoire[] {islande, scandinavie, europeNord, europeOuest};
		europeOuest.getVoisins() = new Territoire[] {europeSud, europeNord, gb, afriqueNord};
		europeSud.getVoisins() = new Territoire[] {europeOuest, europeNord, russie, moyenOrient, egypte, afriqueNord};
		europeNord.getVoisins() = new Territoire[] {gb, scandinavie, russie, europeSud, europeOuest};
		scandinavie.getVoisins() = new Territoire[] {islande, gb, europeNord, russie};
		russie.getVoisins() = new Territoire[] {scandinavie, europeNord, europeSud, moyenOrient, afghanistan, oural};
		//------------------------Australie--------------------------
		indonesie.getVoisins() = new Territoire[] {asieSudEst, nouvGuinee, australieOccidentale};
		nouvGuinee.getVoisins() = new Territoire[] {indonesie, australieOrientale};
		australieOccidentale.getVoisins() = new Territoire[] {indonesie, australieOrientale};
		australieOrientale.getVoisins() = new Territoire[] {australieOccidentale, nouvGuinee};

		//Initialiser le plateau
		Territoire[][] plateau = new Territoire[largeur][hauteur];

        // Initialisation du plateau avec des cases vides
        for (int x = 0; x < largeur; x++) {
            for (int y = 0; y < hauteur; y++) {
                plateau = new Territoire[x][y];
            }
        }

		// Affecter des cases à des territoires
		//-----------------------Afrique-----------------------------
        plateau[10][8].setTerritoire(egypte);
        plateau[11][8].setTerritoire(egypte);

        plateau[7][8].setTerritoire(afriqueNord);
        plateau[8][8].setTerritoire(afriqueNord);
        plateau[9][8].setTerritoire(afriqueNord);
        plateau[7][9].setTerritoire(afriqueNord);
        plateau[8][9].setTerritoire(afriqueNord);
        plateau[9][9].setTerritoire(afriqueNord);
        plateau[8][10].setTerritoire(afriqueNord);
        plateau[9][10].setTerritoire(afriqueNord);

        plateau[12][8].setTerritoire(afriqueOrientale);
        plateau[10][9].setTerritoire(afriqueOrientale);
        plateau[11][9].setTerritoire(afriqueOrientale);
        plateau[12][9].setTerritoire(afriqueOrientale);
        plateau[10][10].setTerritoire(afriqueOrientale);
        plateau[11][10].setTerritoire(afriqueOrientale);
        plateau[12][10].setTerritoire(afriqueOrientale);
        plateau[10][11].setTerritoire(afriqueOrientale);
        plateau[11][11].setTerritoire(afriqueOrientale);

        plateau[8][11].setTerritoire(afriqueOrientale);
        plateau[9][11].setTerritoire(afriqueCentrale);

        plateau[9][12].setTerritoire(afriqueSud);
        plateau[10][12].setTerritoire(afriqueSud);
        plateau[11][12].setTerritoire(afriqueSud);

        plateau[12][11].setTerritoire(madagascar);
        plateau[12][12].setTerritoire(madagascar);

        //------------------Amérique du Nord-------------------------
        plateau[0][1].setTerritoire(alaska);
        plateau[0][2].setTerritoire(alaska);
        plateau[18][1].setTerritoire(alaska);

        plateau[1][1].setTerritoire(territoireNordOuest);
        plateau[2][1].setTerritoire(territoireNordOuest);
        plateau[3][1].setTerritoire(territoireNordOuest);

        plateau[4][1].setTerritoire(groenland);
        plateau[5][1].setTerritoire(groenland);
        plateau[4][2].setTerritoire(groenland);
        plateau[5][2].setTerritoire(groenland);

        plateau[1][2].setTerritoire(alberta);
        plateau[1][3].setTerritoire(alberta);

        plateau[2][2].setTerritoire(ontario);
        plateau[3][2].setTerritoire(ontario);
        plateau[2][3].setTerritoire(ontario);
        plateau[3][3].setTerritoire(ontario);

        plateau[4][3].setTerritoire(canada);

        plateau[1][4].setTerritoire(euOuest);
        plateau[2][4].setTerritoire(euOuest);

        plateau[3][4].setTerritoire(euEst);
        plateau[4][4].setTerritoire(euEst);
        plateau[3][5].setTerritoire(euEst);
        plateau[4][5].setTerritoire(euEst);

        plateau[2][5].setTerritoire(ameriqueCentrale);
        plateau[2][6].setTerritoire(ameriqueCentrale);
        plateau[2][7].setTerritoire(ameriqueCentrale);

        //-------------------Amérique du Sud-------------------------
        plateau[2][8].setTerritoire(venezuela);
        plateau[3][8].setTerritoire(venezuela);

        plateau[3][9].setTerritoire(bresil);
        plateau[4][9].setTerritoire(bresil);
        plateau[5][9].setTerritoire(bresil);
        plateau[6][9].setTerritoire(bresil);
        plateau[3][10].setTerritoire(bresil);
        plateau[4][10].setTerritoire(bresil);
        plateau[5][10].setTerritoire(bresil);
        plateau[5][11].setTerritoire(bresil);

        plateau[2][9].setTerritoire(perou);

        plateau[2][10].setTerritoire(argentine);
        plateau[2][11].setTerritoire(argentine);
        plateau[3][11].setTerritoire(argentine);
        plateau[4][11].setTerritoire(argentine);
        plateau[3][12].setTerritoire(argentine);
        plateau[4][12].setTerritoire(argentine);

        //------------------------Asie-------------------------------
        plateau[13][2].setTerritoire(oural);
        plateau[13][3].setTerritoire(oural);
        plateau[13][4].setTerritoire(oural);
        plateau[13][5].setTerritoire(oural);

        plateau[14][1].setTerritoire(siberie);
        plateau[14][2].setTerritoire(siberie);
        plateau[14][3].setTerritoire(siberie);
        plateau[14][4].setTerritoire(siberie);

        plateau[15][1].setTerritoire(yakoutie);

        plateau[16][1].setTerritoire(kamchatka);
        plateau[17][1].setTerritoire(kamchatka);
        plateau[16][2].setTerritoire(kamchatka);

        plateau[15][2].setTerritoire(irkoutsk);

        plateau[15][3].setTerritoire(mongolie);
        plateau[16][3].setTerritoire(mongolie);
        plateau[15][4].setTerritoire(mongolie);
        plateau[16][4].setTerritoire(mongolie);

        plateau[17][2].setTerritoire(japon);
        plateau[17][3].setTerritoire(japon);

        plateau[12][6].setTerritoire(afghanistan);
        plateau[13][6].setTerritoire(afghanistan);

        plateau[14][5].setTerritoire(chine);
        plateau[15][5].setTerritoire(chine);
        plateau[16][5].setTerritoire(chine);
        plateau[14][6].setTerritoire(chine);
        plateau[15][6].setTerritoire(chine);
        plateau[16][6].setTerritoire(chine);
        plateau[15][7].setTerritoire(chine);

        plateau[11][7].setTerritoire(moyenOrient);
        plateau[12][7].setTerritoire(moyenOrient);

        plateau[13][7].setTerritoire(inde);
        plateau[14][7].setTerritoire(inde);
        plateau[14][8].setTerritoire(inde);
        plateau[14][9].setTerritoire(inde);

        plateau[15][8].setTerritoire(asieSudEst);
        plateau[15][9].setTerritoire(asieSudEst);

		//------------------------Europe-----------------------------
        plateau[6][2].setTerritoire(islande);
        plateau[7][2].setTerritoire(islande);

        plateau[6][3].setTerritoire(gb);
        plateau[7][3].setTerritoire(gb);
        plateau[8][3].setTerritoire(gb);

        plateau[7][4].setTerritoire(europeOuest);
        plateau[7][5].setTerritoire(europeOuest);
        plateau[8][5].setTerritoire(europeOuest);
        plateau[7][6].setTerritoire(europeOuest);
        plateau[8][6].setTerritoire(europeOuest);
        plateau[7][7].setTerritoire(europeOuest);
        plateau[8][7].setTerritoire(europeOuest);

        plateau[9][6].setTerritoire(europeSud);
        plateau[10][6].setTerritoire(europeSud);
        plateau[9][7].setTerritoire(europeSud);
        plateau[10][7].setTerritoire(europeSud);

        plateau[8][4].setTerritoire(europeNord);
        plateau[9][4].setTerritoire(europeNord);
        plateau[10][4].setTerritoire(europeNord);
        plateau[9][5].setTerritoire(europeNord);
        plateau[10][5].setTerritoire(europeNord);

        plateau[8][2].setTerritoire(scandinavie);
        plateau[9][2].setTerritoire(scandinavie);
        plateau[10][2].setTerritoire(scandinavie);
        plateau[9][3].setTerritoire(scandinavie);
        plateau[10][3].setTerritoire(scandinavie);

        plateau[11][2].setTerritoire(russie);
        plateau[12][2].setTerritoire(russie);
        plateau[11][3].setTerritoire(russie);
        plateau[12][3].setTerritoire(russie);
        plateau[11][4].setTerritoire(russie);
        plateau[12][4].setTerritoire(russie);
        plateau[11][5].setTerritoire(russie);
        plateau[12][5].setTerritoire(russie);
        plateau[11][6].setTerritoire(russie);

        //------------------------Australie--------------------------
        plateau[16][9].setTerritoire(indonesie);

        plateau[17][9].setTerritoire(nouvGuinee);

        plateau[16][10].setTerritoire(australieOccidentale);
        plateau[16][11].setTerritoire(australieOccidentale);

        plateau[17][10].setTerritoire(australieOrientale);
        plateau[17][11].setTerritoire(australieOrientale);


    //Méthodes
	public Continent[] getContinents() {
        return continents;
    }

    public void setContinents(Continent[] continents) {
        this.continents = continents;
    }

    public Case[][] getPlateau() {
        return plateau;
    }

    public void setPlateau(Case[][] plateau) {
        this.plateau = plateau;
    }

    }
}