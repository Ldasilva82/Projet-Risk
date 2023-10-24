package tp5.model;

public class Souris extends Animal {

	public Souris(int identifiant, int x, int y, String direction) {
		super(identifiant, x, y, direction);
	}
	
	public String SeDeplacer() {
		return getDirection();
	}
	
	public void Tourner() {
		if(this.getDirection()=="haut") {
			this.setDirection("droite");
		}
		else if(this.getDirection()=="bas") {
			this.setDirection("gauche");
		}
		else if(this.getDirection()=="gauche") {
			this.setDirection("haut");
		}
		else if(this.getDirection()=="droite") {
			this.setDirection("bas");
		}
	}

}
