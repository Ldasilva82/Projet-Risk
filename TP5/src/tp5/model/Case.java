package tp5.model;

import java.util.ArrayList;

public class Case {
	private int x;
	private int y;
	private TypeCase type;
	protected ArrayList<Animal> animaux;
	
	public Case(int x, int y) {
		this.x = x;
		this.y = y;
		this.animaux= new ArrayList<Animal>(); 
 	}
	
	


	public void setType(TypeCase type) {
		this.type = type;
	}




	public TypeCase getType() {
		return type;
	}




	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setAnimal(Animal animal) {
		animaux.add(animal);
	}




	public ArrayList<Animal> getAnimaux() {
		return animaux;
	}
	


}
