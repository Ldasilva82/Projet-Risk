package game.controler;

import game.model.AbstractModel;

public class Controler extends AbstractControler {

	public Controler(AbstractModel model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cliqueSur(int x, int y) {
		// TODO Auto-generated method stub
		model.afficherInfoSelectedTerr(x, y);
		model.demandeMiseAjourVue();

	}

	@Override
	public void calculerStepSuivant() {
		model.nouveauTour();
		System.out.println("Nouveau tour");
		// TODO Auto-generated method stub

	}

}
