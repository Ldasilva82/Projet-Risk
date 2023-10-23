public class Plateau{
	//attribute
	private Continent[] continents;
	//constructor
	public Plateau(){
		//Création des continents 
		continents = new Continent[6];
		continents[1] = new Continent("Afrique", 3);
		continents[2] = new Continent("Amérique du Nord", 5);
		continents[3] = new Continent("Amérique du Sud" 2);
		continents[4] = new Continent("Asie", 7);
		continents[5] = new Continent("Europe", 5);
		continents[6] = new Continent("Australie", 2);

		//création des territoires
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
		Territoire EUOuest = new Territoire("Etats Unis de l'Ouest");
		Territoire EUEst = new Territoire("Etats Unis de l'Est");
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
		Territoire gB = new Territoire("Grande-Bretagne");
		Territoire europeOuest = new Territoire("Europe de l’Ouest");
		Territoire europeSud = new Territoire("Europe de Sud");
		Territoire europeNord = new Territoire("Europe de Nord");
		Territoire scandinavie = new Territoire("Scandinavie");
		Territoire russie = new Territoire("Russie");
		
		//intégration des territoires dans les continents
		//-----------------------Afrique-----------------------------
		continents[1].getList() = new Territoire[]{egypte, afriqueNord, afriqueOrientale, afriqueCentrale, afriqueSud, madagascar};
		//------------------Amérique du Nord-------------------------
		continents[2].getList() = new Territoire[]{alaska, territoireNordOuest, groenland, alberta, ontario, canada, EUOuest, EUEst, ameriqueCentrale};
		//-------------------Amérique du Sud-------------------------
		continents[3].getList() = new Territoire[]{venezuela, bresil, perou, argentine};
		//-------------------------Asie------------------------------

		//-----------------------Australie---------------------------

		//------------------------Europe-----------------------------
		continents[5].getList().add(islande);
		continents[5].getList().add(gb);
		continents[5].getList().add(europeOuest);
		continents[5].getList().add(europeSud);
		continents[5].getList().add(islande);
		continents[5].getList().add(islande);
		
		//intégration des listes de territoires voisins par territoires 
		egypte.getVoisins() = new Territoire[] {afriqueNord, afriqueOrientale, moyenOrient, europeSud}
		
	}
}