package tp5.model;

public class Animal {
	private int identifiant;
	private int x;
	private int y;
	private String direction;
	
	public Animal(int identifiant, int x, int y, String direction) {
		this.direction = direction;
		this.identifiant = identifiant;
		this.x = x;
		this.y = y;	
	}
	
	public String SeDeplacer() {
		return getDirection();
		
	}
	public void Tourner() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}
	
	
	
	

}
