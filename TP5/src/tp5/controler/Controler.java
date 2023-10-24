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
		model.Flecher(x, y);
		model.demandeMiseAjourVue();
		

	}

	@Override
	public void calculerStepSuivant() {
		model.faireSeDeplacerLesAnimaux();
		try {
			Thread.sleep(500);
		}
		catch (InterruptedException ex){
			ex.printStackTrace();
		}
		model.demandeMiseAjourVue();
		// TODO Auto-generated method stub

	}

}
