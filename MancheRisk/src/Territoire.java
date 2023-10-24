public class Territoire {
	//attributes
    private String nomTerritoire;
    private Territoire[] territVoisins;
    private int nbRegiment;
    private Joueur joueurProprietaire;
    private TypeTerritoire typeTerritoire;

    //constructor
    public Territoire(String nomTerrit){
        this.nomTerritoire = nomTerrit;
        this.nbRegiment = 0;
        //voir si possible de ne pas mettre à null
        this.joueurProprietaire = null;
    }
    //methods
    public void setVoisins(Territoire[] listTerrit) {
    	this.territVoisins = listTerrit; 
    }
    public Territoire[] getVoisins(){
        return this.territVoisins;
    }
    public String getNomTerritoire(){
        return this.nomTerritoire;
    }
    
    public int getNbRegiment() {
    	return this.nbRegiment;
    }
    
    public void setNbRegiment(String signe, int nombre) {
    	if(signe.equals("+")) {
    		nbRegiment = nbRegiment + nombre;
    	}
    	else if (signe.equals("-") && nombre<nbRegiment) {
    		nbRegiment = nbRegiment - nombre;
    	}
    }
    
    public Joueur getJoueurProprietaire() {
    	return this.joueurProprietaire;
    }
    
    public void setJoueurProprietaire(Joueur newProprio) {
    	joueurProprietaire = newProprio;
    }
    
    public TypeTerritoire getTypeTerritoire() {
    	return this.typeTerritoire;
    }
    
    public TypeTerritoire setTypeTerritoire(TypeTerritoire type) {
    	return this.typeTerritoire = type;
    }
    
}
