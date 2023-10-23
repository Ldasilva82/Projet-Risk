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
		continents[1].getList().add(egypte);
		continents[1].getlist().add(afriqueNord);
		continents[1].getlist().add(afriqueOrientale);
		continents[1].getlist().add(afriqueCentrale);
		continents[1].getlist().add(afriqueSud);
		continents[1].getlist().add(madagascar);
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
	}
}