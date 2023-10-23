public class Territoire {
    private String nomTerritoire;
    private Territoire[] territVoisins;
    private int nbRegiment;
    private Joueur joueurProprietaire; 


    public Territoire(String nomTerrit){
        this.nomTerritoire = nomTerrit;
        this.nbRegiment = 0;
        this.joueurProprietaire = null;
    }
    public Territoires[] getVoisins(){
        return this.territVoisins;
    }
}
