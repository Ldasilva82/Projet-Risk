import java.util.ArrayList;
import java.util.Scanner;

public class Manche{
    	//attribute 
    private Plateau plateau;
    private int nbEchange;
    private ArrayList<Joueur> listjoueur;
    private Scanner scanner;
    //constructor 
    public Manche(){
    	//lancer le jeu avec 5 joueur 
        débuterManche(5);
    }
    //method 
    private void débuterManche(int nbJoueur) {
    	//créer la liste de l'ordre de passage
    	ArrayList<Joueur> listjoueur = ArrayList<Joueur>();
    	//créer les joueurs 
    	for(int i=0; i<nbJoueur; i++) {
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("nom du joueur");
            //voir comment 
    		Joueur player = new Joueur(scanner.nextLine());
    		player.lancerDé();
    		listjoueur.add(player);
    	}
    	
    }
    private ArrayList<> setOrdreJoueur(int nbJoueur){
    	
    }
}