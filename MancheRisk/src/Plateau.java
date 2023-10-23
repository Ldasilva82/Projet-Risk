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
		Territoire territEurope1 = new Territoire("Islande");
		Territoire territEurope2 = new Territoire("Grande-Bretagne");
		Territoire territEurope3 = new Territoire("Europe de l’Ouest");
		Territoire territEurope4 = new Territoire("Europe de Sud");
		Territoire territEurope5 = new Territoire("Europe de Nord");
		Territoire territEurope6 = new Territoire("Scandinavie");
		Territoire territEurope7 = new Territoire("Russie");
		Territoire territAfrique1 = new Territoire("");
		Territoire territAfrique2 = new Territoire("");
		Territoire territAfrique3 = new Territoire("");
		Territoire territAfrique4 = new Territoire("");
		Territoire territAfrique5 = new Territoire("");
		Territoire territAfrique6 = new Territoire("");
		Territoire territ

		
		//intégration des territoires dans les continents
		continents[5].getList().add(territEurope);
		
	}
}