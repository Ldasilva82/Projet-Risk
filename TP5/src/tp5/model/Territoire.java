package tp5.model;

public class Territoire {
	protected String libellé;
	protected int NbRegiments;
	protected Joueur proprietaire;
	private TypeCase type;
	private Territoire[] territVoisins;
	
	public Territoire(String libellé) {
		this.libellé = libellé;
		this.NbRegiments = 0;
		this.proprietaire = null;
		
	}
	
	
	public void setTerritVoisins(Territoire[] territVoisins) {
		this.territVoisins = territVoisins;
	}

	public Territoire[] getTerritVoisins() {
		return territVoisins;
	}


	public int getNbRegiments() {
		return NbRegiments;
	}
	public void setNbRegiments(int nbRegiments) {
		NbRegiments = nbRegiments;
	}
	public Joueur getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getLibellé() {
		return libellé;
	}
	
	
	public TypeCase getType() {
		return type;
	}

	public void setType(TypeCase type) {
		this.type = type;
		
	}





	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	
	
	

}
