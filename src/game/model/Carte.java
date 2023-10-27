package game.model;



public abstract class Carte {
    private TypeCarte type;

    public Carte(TypeCarte type) {
        this.type = type;
    }

    public TypeCarte getType() {
        return type;
    }

	
	}
