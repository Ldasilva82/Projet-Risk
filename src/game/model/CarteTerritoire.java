package game.model;




public class CarteTerritoire extends Carte {
    private Territoire territoire;

    public CarteTerritoire(Territoire territoire, TypeCarte type) {
        super(type);
        this.territoire = territoire;
    }

    public Territoire getTerritoire() {
        return territoire;
    }
}