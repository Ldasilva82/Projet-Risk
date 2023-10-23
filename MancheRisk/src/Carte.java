public class Carte {
    private Territoire territoire;
	private String typeSymbole;

	public Carte(String nomTerrit, String symbole) {
		this.typeSymbole =symbole;
		//if getNomTerritoire.equals nomTerrit --- à faire
		this.territoire = territoire;
	}

    public String getTypeSymbole() {
		return this.typeSymbole;
	}

    public Territoire getTerritoire(){
        return this.territoire;
    }


}
