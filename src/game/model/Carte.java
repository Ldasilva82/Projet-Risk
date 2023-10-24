package game.model;

public class Carte {
    private Territoire territoire;
	private String typeSymbole;

	public Carte(String nomTerrit, Territoire territoire2) {
		this.typeSymbole =typeSymbole;
		//if getNomTerritoire.equals nomTerrit --- à faire
		this.territoire = territoire;
	}

    public String getTypeSymbole() {
		return this.typeSymbole;
	}

    public Territoire getTerritoire(){
        return this.territoire;
    }

	public String getName() {
        return territoire.getNomTerritoire() + ", " + typeSymbole;
    }


}

