/*
 package game.vue;

import java.util.ArrayList;

import javax.swing.GroupLayout;


import game.controler.AbstractControler;
import game.model.AbstractModel;
import game.model.Carte;
import game.model.CarteJoker;
import game.model.CarteTerritoire;

import game.model.Joueur;
import game.model.Plateau;
import game.vue.observer.Observateur;

/**
 *
 * @author Pauline, Alex, Lucas, Ravaka, Yaning
 */

 package game.vue;

import java.util.ArrayList;

import javax.swing.GroupLayout;


import game.controler.AbstractControler;
import game.model.AbstractModel;
import game.model.Carte;
import game.model.CarteJoker;
import game.model.CarteTerritoire;

import game.model.Joueur;
import game.model.Plateau;
import game.vue.observer.Observateur;

public class Vue extends javax.swing.JFrame implements Observateur{

    /**
	 * 
	 */
	// Attributes
	private static final long serialVersionUID = 1L;
	private AbstractModel model;
    private MouseListener mouseListener;
    private Plateau plateauFactice;
    
    // Constructor
    /**
     * Creates new form 
     * @param model
     * @param controler
     */
    public Vue(AbstractModel model, AbstractControler controler) {
        this.model = model;
        //this.controler = controler;
        initComponents();
        this.mouseListener = new MouseListener(controler);
        this.panelJeu.addMouseListener(this.mouseListener);
        this.plateauFactice = new Plateau(19, 14);
        
    }
    
    // Methods
    /// Methode pour dessiner le plateau de jeu
    public void dessinerJeu(){
        int h = this.panelJeu.getWidth();
        int l = this.panelJeu.getHeight();
        int x, y, cote;
        if(l/model.getLargeur() > h/model.getHauteur()){
            cote = h/model.getHauteur();
            y = (int) ((l-(cote*model.getLargeur()))/2.f);
            x = 0;
        } else {
            cote = l/model.getLargeur();
            x = (int) ((h-(cote*model.getHauteur()))/2.f);
            y = 0;
        }
        this.mouseListener.updateDimension(x, y, x+cote*model.getHauteur(), y+cote*model.getLargeur(), cote);
        for(int xP=0; xP<model.getHauteur();xP++){
            for(int yP=0; yP<model.getLargeur();yP++){
                switch(model.getTypeCase(xP, yP)){
                  
                    case MER : 
                        panelJeu.drawCaseMer(x+xP*cote, y+yP*cote, cote);
                    break;
                  //------------------Australie---------------------------------
                    case NOUVGUINEE : 
                        panelJeu.drawCaseNouvGuinee(x+xP*cote, y+yP*cote, cote);
                    break;
                    case INDONESIE : 
                        panelJeu.drawCaseIndonesie(x+xP*cote, y+yP*cote, cote);
                    break;
                    case AUSTRALIEOCCIDENTALE : 
                        panelJeu.drawCaseAustralieOccidentale(x+xP*cote, y+yP*cote, cote);
                    break;
                    case AUSTRALIEORIENTALE : 
                        panelJeu.drawCaseAustralieOrientale(x+xP*cote, y+yP*cote, cote);
                    break;
                  //------------------Asie---------------------------------
                    case ASIESUDEST : 
                        panelJeu.drawCaseAsieSudEst(x+xP*cote, y+yP*cote, cote);
                    break;
                    case SIBERIE : 
                        panelJeu.drawCaseSiberie(x+xP*cote, y+yP*cote, cote);
                    break;
                    case INDE : 
                        panelJeu.drawCaseInde(x+xP*cote, y+yP*cote, cote);
                    break;
                    case OURAL : 
                        panelJeu.drawCaseOural(x+xP*cote, y+yP*cote, cote);
                    break;
                    case CHINE : 
                        panelJeu.drawCaseChine(x+xP*cote, y+yP*cote, cote);
                    break;
                    case KAMCHATKA : 
                        panelJeu.drawCaseKamchatka(x+xP*cote, y+yP*cote, cote);
                    break;
                    case YAKOUTIE : 
                        panelJeu.drawCaseYakoutie(x+xP*cote, y+yP*cote, cote);
                    break;
                    case MONGOLIE : 
                        panelJeu.drawCaseMongolie(x+xP*cote, y+yP*cote, cote);
                    break;
                    case JAPON : 
                        panelJeu.drawCaseJapon(x+xP*cote, y+yP*cote, cote);
                    break;
                    case IRKOUTSK : 
                        panelJeu.drawCaseIrkoutsk(x+xP*cote, y+yP*cote, cote);
                    break;
                    case AFGHANISTAN : 
                        panelJeu.drawCaseAfghanistan(x+xP*cote, y+yP*cote, cote);
                    break;
                    case MOYENORIENT : 
                        panelJeu.drawCaseMoyenOrient(x+xP*cote, y+yP*cote, cote);
                    break;
                  //------------------Afrique---------------------------------
                    case AFRIQUENORD : 
                        panelJeu.drawCaseAfriqueNord(x+xP*cote, y+yP*cote, cote);
                    break;
                    case AFRIQUECENTRALE : 
                        panelJeu.drawCaseAfriqueCentrale(x+xP*cote, y+yP*cote, cote);
                    break;
                    case AFRIQUEORIENTALE : 
                        panelJeu.drawCaseAfriqueOrientale(x+xP*cote, y+yP*cote, cote);
                    break;
                    case AFRIQUESUD : 
                        panelJeu.drawCaseAfriqueSud(x+xP*cote, y+yP*cote, cote);
                    break;
                    case EGYPTE: 
                        panelJeu.drawCaseEgypte(x+xP*cote, y+yP*cote, cote);
                    break;
                  //------------------Europe---------------------------------
                    case MADAGASCAR : 
                        panelJeu.drawCaseMadagascar(x+xP*cote, y+yP*cote, cote);
                    break;
                    case GRANDEBRETAGNE : 
                        panelJeu.drawCaseGrandeBretagne(x+xP*cote, y+yP*cote, cote);
                    break;
                    case ISLANDE : 
                        panelJeu.drawCaseIslande(x+xP*cote, y+yP*cote, cote);
                    break;
                    case SCANDINAVIE : 
                        panelJeu.drawCaseScandinavie(x+xP*cote, y+yP*cote, cote);
                    break;
                    case RUSSIE: 
                        panelJeu.drawCaseRussie(x+xP*cote, y+yP*cote, cote);
                    break;
                    case EUROPENORD : 
                        panelJeu.drawCaseEuropeNord(x+xP*cote, y+yP*cote, cote);
                    break;
                    case EUROPEOUEST : 
                        panelJeu.drawCaseEuropeOuest(x+xP*cote, y+yP*cote, cote);
                    break;
                    case EUROPESUD : 
                        panelJeu.drawCaseEuropeSud(x+xP*cote, y+yP*cote, cote);
                    break;
                  //------------------Amérique Nord---------------------------------
                    case ONTARIO : 
                        panelJeu.drawCaseOntario(x+xP*cote, y+yP*cote, cote);
                    break;
                    case ALASKA : 
                        panelJeu.drawCaseAlaska(x+xP*cote, y+yP*cote, cote);
                    break;
                    case NORDOUEST : 
                        panelJeu.drawCaseNordOuest(x+xP*cote, y+yP*cote, cote);
                    break;
                    case ALBERTA : 
                        panelJeu.drawCaseAlberta(x+xP*cote, y+yP*cote, cote);
                    break;
                    case CANADA : 
                        panelJeu.drawCaseCanada(x+xP*cote, y+yP*cote, cote);
                    break;
                    case GROENLAND : 
                        panelJeu.drawCaseGroenland(x+xP*cote, y+yP*cote, cote);
                    break;
                    case USAWEST : 
                        panelJeu.drawCaseEtatsUnisOuest(x+xP*cote, y+yP*cote, cote);
                    break;
                    case USAEST : 
                        panelJeu.drawCaseEtatsUnisEst(x+xP*cote, y+yP*cote, cote);
                    break;
                    case CENTRALE : 
                        panelJeu.drawCaseAmeriqueCentrale(x+xP*cote, y+yP*cote, cote);
                    break;
                  //------------------Amérique Sud---------------------------------
                    case VENEZUELA : 
                        panelJeu.drawCaseVenezuela(x+xP*cote, y+yP*cote, cote);
                    break;
                    case BRESIL : 
                        panelJeu.drawCaseBresil(x+xP*cote, y+yP*cote, cote);
                    break;
                    case ARGENTINE : 
                        panelJeu.drawCaseArgentine(x+xP*cote, y+yP*cote, cote);
                    break;
                    case PEROU : 
                        panelJeu.drawCasePerou(x+xP*cote, y+yP*cote, cote);
                    break;
                    
// -----------------------------------------------------------------------RESSOURCES TP5-----------------------
                    
                    case CHEMIN : 
                        panelJeu.drawCaseChemin(x+xP*cote, y+yP*cote, cote);
                    break;
                    case FLECHE_HAUT : 
                        panelJeu.drawCaseFlecheHaut(x+xP*cote, y+yP*cote, cote);
                    break;
                    case FLECHE_DROITE : 
                        panelJeu.drawCaseFlecheDroite(x+xP*cote, y+yP*cote, cote);
                    break;
                    case FLECHE_BAS : 
                        panelJeu.drawCaseFlecheBas(x+xP*cote, y+yP*cote, cote);
                    break;
                    case FLECHE_GAUCHE : 
                        panelJeu.drawCaseFlecheGauche(x+xP*cote, y+yP*cote, cote);
                    break;
                }
               
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    //Methodes pour initialiser les composants
    private void initComponents() {
    	
        labelJoueur = new javax.swing.JLabel();
        nbEchanges= new javax.swing.JLabel();
        cartesDuJoueur = new javax.swing.JLabel();
        panelJeu = new game.vue.PanelJeu(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        labelJoueur.setText("Joueur : " );
        nbEchanges.setText("Nombre d'échange" );       
        cartesDuJoueur.setText("acrtes");
        
        // Init un gestionnaire d'interface avec GroupLayout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

     // disposition verticale
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(labelJoueur)
                .addComponent(nbEchanges)
                .addComponent(cartesDuJoueur)
                .addComponent(panelJeu)
        );

        // disposition horizontale
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(labelJoueur)
                .addComponent(nbEchanges)
                .addComponent(cartesDuJoueur)
                .addComponent(panelJeu)
        );

        
        pack();
    
    }// </editor-fold>//GEN-END:initComponents

    /// Methode pour afficher les info de la partie dans les composants
   public void afficherInfoJoueur(Joueur joueur, Vue vue) {
        if (vue != null) {
            vue.labelJoueur.setText("Nom du joueur : " + joueur.getNomJoueur());

            ArrayList<Carte> cartes = joueur.getCartesPossedees();
            StringBuilder cartesPossedees = new StringBuilder("Cartes possédées : ");
            for (Carte carte : cartes) {
                if (carte instanceof CarteTerritoire) {
                    CarteTerritoire carteTerritoire = (CarteTerritoire) carte;
                    cartesPossedees.append(carteTerritoire.getType()).append(" (").append(carteTerritoire.getTerritoire().getNomTerritoire()).append("), ");
                } else if (carte instanceof CarteJoker) {
                    cartesPossedees.append(carte.getType()).append(", ");
                }
            }
            vue.cartesDuJoueur.setText(cartesPossedees.toString());

            
			int nbEchanges = plateauFactice.getNbEchange(); // Utilisez l'instance factice du plateau
            vue.nbEchanges.setText("Nombre d'échanges : " + nbEchanges);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nbEchanges;
    private javax.swing.JLabel labelJoueur;
    private javax.swing.JLabel cartesDuJoueur;
    private game.vue.PanelJeu panelJeu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        repaint();
    }
}