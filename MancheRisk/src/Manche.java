public class Manche{
    	//attribute 
    private Plateau plateau;
    private int nbEchange;
    private ArrayList<Joueur> listjoueur;
    private Scanner scanner;
    //constructor 
    public Manche(int nbJoueur){
    	//lancer le jeu 
        débuterManche(nbJoueur);
    }
    //method 
    public void débuterManche(int nbJoueur) {
    	//créer la liste de l'ordre de passage
    	ArrayList<Joueur> listjoueur = ArrayList<Joueur>();
    	//créer les joueurs 
    	for(int i=0; i<nbJoueur; i++) {
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("nom du joueur");
    		Joueur player = new Joueur(scanner.nextLine());
    		player. 
    		listjoueur.add(player);
    	}
    	
    }
    public ArrayList<> setOrdreJoueur(int nbJoueur){
    	
    }
}