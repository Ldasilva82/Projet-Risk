package game.model;

public class Territoire {
	// Attributes
	protected String nomTerritoire;
	protected int nbRegiment;
	protected Joueur joueurProprio;
	private Territoire[] territVoisinsList;
	private TypeCase type;
	
	//private TypeTerritoire typeTerritoire;
	
	// Constructor
	public Territoire(String libellé) {
		this.nomTerritoire = libellé;
		this.nbRegiment = 0;
		this.joueurProprio = null; //voir si possible de ne pas mettre à null
		
	}
	
	// Methods
	///Getters
	public String getNomTerritoire() {
		return nomTerritoire;
	}
	public int getNbRegiments() {
		return nbRegiment;
	}
	public Joueur getProprietaire() {
		return joueurProprio;
	}
	public Territoire[] getTerritVoisins() {
		return territVoisinsList;
	}
	public TypeCase getType() {
		return type;
	}
	
	
	
	//public TypeTerritoire getTypeTerritoire() {
    	//return this.typeTerritoire};
    


	///Setters
	public void setNomTerritoire(String nomTerrit) {
		this.nomTerritoire = nomTerrit;
	}
	
	public void setNbRegiment(String signe, int nombre) {
		if(signe.equals("+")) {
    		nbRegiment = nbRegiment + nombre;
    	}
    	else if (signe.equals("-") && nombre<nbRegiment) {
    		nbRegiment = nbRegiment - nombre;
    	}
	}
	
	public void setProprietaire(Joueur proprietaire) {
		this.joueurProprio = proprietaire;
	}
	public void setTerritVoisins(Territoire[] territVoisins) {
		this.territVoisinsList = territVoisins;
	}
	public void setType(TypeCase type) {
		this.type = type;
	}
	
	public void ajouterRegiments(int nbRegiment) {
        this.nbRegiment += nbRegiment;
    }

    

	
}
