import java.util.List;

public class Continent {
	private String nomContinent;
	private int point;
	private ArrayList<Territoire> territoires;

	public Continent(String nomContinent, int point){
		this.nomContinent = nomContinent;
		this.point = point;
	}

	public String getnomContinent(){
		return nomContinent;
	}
	public ArrayList<Territoire> getList(){
		return this.territoires;
	}
	// il faut une méthode d'ajout de territoire dans la liste 
	public void ajouterTerritVoisin(Territoire voisinàAjouter){
		//TODO
	}
}