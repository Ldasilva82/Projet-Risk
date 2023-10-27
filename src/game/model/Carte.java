package game.model;

public abstract class Carte {
	// Attributes 
    private TypeCarte type;
    
    // Constructor
    public Carte(TypeCarte type) {
        this.type = type;
    }
    // Methods
    public TypeCarte getType() {
        return type;
    }
}
