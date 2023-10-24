package tp5.model;

public class Chat extends Animal {
	
	public Chat(int identifiant, int x, int y, String direction) {
		super(identifiant, x, y, direction);
		
	}
	
	
	//faire un retour avec la direction ou il veut aller
	public String SeDeplacer() {
		return getDirection();
	}
	
	public void Tourner() {
		if(this.getDirection()=="haut") {
			this.setDirection("bas");
		}
		else if(this.getDirection()=="bas") {
			this.setDirection("haut");
		}
		else if(this.getDirection()=="gauche") {
			this.setDirection("droite");
		}
		else if(this.getDirection()=="droite") {
			this.setDirection("gauche");
		}
	}
	
			
		
	

}
