package game.model;

public class CarteTerritoire extends Carte {
	//Attributes
    private Territoire territoire;

    //Constructor
    public CarteTerritoire(Territoire territoire, TypeCarte type) {
        super(type);
        this.territoire = territoire;
    }
    /// Methods
    public Territoire getTerritoire() {
        return territoire;
    }
}