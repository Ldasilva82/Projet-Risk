package tp5.controler;

import tp5.model.AbstractModel;

public class Controler extends AbstractControler {

	public Controler(AbstractModel model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cliqueSur(int x, int y) {
		// TODO Auto-generated method stub
		model.selectTer(x, y);
		model.demandeMiseAjourVue();

	}

	@Override
	public void calculerStepSuivant() {
		model.nouveauTour();
		
		// TODO Auto-generated method stub

	}

}
