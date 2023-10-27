package game;

import game.controler.AbstractControler;
import game.controler.Controler;
import game.model.AbstractModel;
import game.model.Joueur;
import game.model.Plateau;
import game.vue.Vue;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 * @author alex, ravaka, pauline, lucas, yaning
 */
public class GAME {

    /**
     * exécution du plateau
     */
    public static void main(String[] args) {
        Plateau model = new Plateau(19,19); 
        Controler controler = new Controler(model);
        Vue v = new Vue(model,controler);
        model.addObservateur(v);
        v.setVisible(true);
    	int numPartie = 2;
        
    	/**
    	 *  Informations de connexion, pour connecter l'application à la BDD
    	 */
    	String urlBD = "jdbc:mysql://localhost:8889/MancheRisk";
    	String jdbc = "org.mysql.jdbc.Driver";
    	String user = "root";
    	String password = "root";
    	
    	/**
    	 *  On vérifie bien que la connexion avec la base de données s'effectue sans aucun problème.
    	 */
    	try {
    	    Class.forName("com.mysql.cj.jdbc.Driver");
    	    Connection connexion = DriverManager.getConnection(urlBD, user, password);
    	    System.out.println("Connexion établie avec la BD");
    	    
    	    /**
    	     * Requête pour afficher les joueurs affectés à la partie 
    	     */
    	    System.out.println("-----Liste des joueurs de la partie-----");
    	    Statement statement = connexion.createStatement();
            String requeteJoueurs = "SELECT * FROM Joueur, Participer WHERE Joueur.idJoueur = Participer.idJoueur AND Participer.idPartie = " + numPartie;
            ResultSet resultSet = statement.executeQuery(requeteJoueurs);
            
            while(resultSet.next()){
                int idJoueur = resultSet.getInt("idJoueur");
                String nomJoueur  = resultSet.getString("nomJoueur");
                String prenomJoueur = resultSet.getString("prenomJoueur");
                String numInscriptionJoueur = resultSet.getString("numInscriptionJoueur");
                Joueur joueurs = new Joueur(nomJoueur,prenomJoueur);
                System.out.println(joueurs.getNomJoueur().toUpperCase() + " " + joueurs.getPrenomJoueur());
                model.getOrdreJoueur().add(joueurs);    
            }
   
            
        	while(model.partieTerminer()){
            	System.out.println("yes");
                controler.calculerStepSuivant();
            }
                        
            /**
    	     * Enregistrement du nombre d'attaques réussies, défenses réussies, dé 1 obtenus et territoires conquis par joueur
    	     */
            for (Joueur joueurPartie : model.getOrdreJoueur()) {
            	String requetePoints = "UPDATE Joueur "
            			+ "SET nbAttaqueReussie = " + joueurPartie.getNbAttaqueReussie() + ", "
            			+ "nbDefenseReussie = " + joueurPartie.getNbDefenseReussie() + ", "
                        + "nbDeUn = " + joueurPartie.getNbDe1() + ", "
                        + "nbTerritoireConquis = " + joueurPartie.getNbTerritoireConquis()
                        + " WHERE idJoueur = " + joueurPartie.getNumeroInscription();
                statement.executeUpdate(requetePoints);

//                /**
//        	     * Enregistrement des scores des joueurs à l'issue de la partie (en attente de getJoueurEliminer())
//        	     */
//                int scoreObtenu = 0;
//                for(int i = 0 ; i < model.getJoueurElimine().size(); i++) {
//                    scoreObtenu = scoreObtenu + 2;
//                    if(getJoueurElimine().get(i).getNumeroInscription().equals(joueurPartie.getNumeroInscription())) {
//                      String requeteScore = "UPDATE Participer "
//                        + "SET score = " + scoreObtenu + ", "
//                        + "WHERE idPartie = " + numPartie + ", "
//                        + "AND idJoueur = " + joueurPartie.getNumeroInscription();
//                    statement.executeUpdate(requeteScore);
//                    }
//               }
            }
            
            /**
    	     * Enregistrement de la date/heure de fin de la partie à la BD
    	     */
            Timestamp finPartie = new Timestamp(System.currentTimeMillis());
            String requeteFinPartie = "UPDATE Partie "
            		+ "SET dateFinPartie = " + finPartie
                    + " WHERE idPartie = " + numPartie;
            statement.executeUpdate(requeteFinPartie);
        	
            /**
    	     * Affiche l'ordre de jeu des joueurs durant la partie
    	     */
            System.out.println("-----Liste ordre des joueurs-----");
            for (Joueur joueur : model.getOrdreJoueur()) {
            	System.out.println(joueur.getNomJoueur().toUpperCase() + " " + joueur.getPrenomJoueur());
            	}
            
            /**
        	 * Fermer toutes les connexions ouvertes de la BD.
        	 */
            resultSet.close();
            statement.close();
            connexion.close();
            
          /**
           * Gère les exeptions (erreurs).
           */  
    	} catch (Exception exception){
    	    exception.printStackTrace();
    	    System.out.println("Erreur");
    	    System.exit(0);
    	}
    }
}
