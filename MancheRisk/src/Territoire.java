public class Territoire {
    private String nomTerritoire;
    private Territoire[] territVoisins;
    private int nbRegiment;
    private Joueur joueurProprietaire;
    private TypeTerritoire typeTerritoire;


    public Territoire(String nomTerrit){
        this.nomTerritoire = nomTerrit;
        this.nbRegiment = 0;
        //voir si possible de ne pas mettre à null
        this.joueurProprietaire = null;
    }
    public void setVoisins(Territoire[] listTerrit) {
    	this.territVoisins = listTerrit; 
    }
    public Territoire[] getVoisins(){
        return this.territVoisins;
    }
    public String getNomTerritoire(){
        return this.nomTerritoire;
    }
    
    public TypeTerritoire getTypeTerritoire() {
    	return this.typeTerritoire;
    }
    
    public TypeTerritoire setTypeTerritoire(TypeTerritoire type) {
    	return this.typeTerritoire = type;
    }
    
}
