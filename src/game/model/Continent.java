package game.model;

public class Continent {
	// Attributes
	private String nomContinent;
	private int point;
	private Territoire[] territoires;

	// Constructor
	public Continent(String nomContinent, int point){
		this.nomContinent = nomContinent;
		this.point = point;
	}

	// Methods
	/// Getters
	public String getnomContinent(){
		return nomContinent;
	}
	public int getPoint() {
		return this.point;
	}	
	public Territoire[] getTerritoiresList(){
		return this.territoires;
	}
		
	/// Setters
	public void setTerritoiresList(Territoire[] listTerrit) {
		this.territoires = listTerrit;
	}
		
}
