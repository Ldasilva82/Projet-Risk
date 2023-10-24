import java.util.ArrayList;
import java.util.List;

public class Continent {
	private String nomContinent;
	private int point;
	private Territoire[] territoires;

	public Continent(String nomContinent, int point){
		this.nomContinent = nomContinent;
		this.point = point;
	}

	public String getnomContinent(){
		return nomContinent;
	}
	
	public int getPoint() {
		return this.point;
	}
	
	public Territoire[] getList(){
		return this.territoires;
	}
	
	public void setList(Territoire[] listTerrit) {
		this.territoires = listTerrit;
	}
	
}