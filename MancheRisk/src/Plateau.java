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
		//------------------------Europe-----------------------------
		Territoire islande = new Territoire("Islande");
		Territoire gB = new Territoire("Grande-Bretagne");
		Territoire europeOuest = new Territoire("Europe de l’Ouest");
		Territoire europeSud = new Territoire("Europe de Sud");
		Territoire europeNord = new Territoire("Europe de Nord");
		Territoire scandinavie = new Territoire("Scandinavie");
		Territoire russie = new Territoire("Russie");
		//------------------------Afrique-----------------------------
		Territoire egypte = new Territoire("Egypte");
		Territoire afriqueNord = new Territoire("Afrique du Nord");
		Territoire afriqueOrientale = new Territoire("Afrique Orientale");
		Territoire afriqueCentrale = new Territoire("Afrique Centrale");
		Territoire afriqueSud = new Territoire("Afrique du Sud");
		Territoire madagascar = new Territoire("Madagascar");
		//----------------------Australie-----------------------------
		Territoire indonesie = new Territoire("Indonésie");
		Territoire nouvGuinee = new Territoire("Nouvelle Guinée");
		Territoire australieOccidentale = new Territoire("Australie Occidentale");
		Territoire australieOrientale = new Territoire("Australie Orientale");
		//-------------------Amérique du Nord-------------------------
		//-------------------Amérique du Sud--------------------------
		

		
		//intégration des territoires dans les continents
		continents[5].getList().add(islande);
		continents[5].getList().add(gb);
		continents[5].getList().add(europeOuest);
		continents[5].getList().add(europeSud);
		continents[5].getList().add(islande);
		continents[5].getList().add(islande);
		//intégration des listes de territoires voisins par territoires 
		egypte.getList().add(afriqueNord);
		
	}
}