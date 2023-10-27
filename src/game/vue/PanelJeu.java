/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.vue;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Lucas, Pauline, Alex, Ravaka, Yaning
 */
public class PanelJeu extends javax.swing.JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Vue fenetre;
    private Graphics cg;
    
    public PanelJeu(Vue fenetre) {
        this.fenetre = fenetre;
    }
    public PanelJeu() {
    }
    
    @Override
    public void paintComponent (Graphics g) {
        cg = g;
	super.paintComponent (cg) ;
        if(fenetre != null){
            fenetre.dessinerJeu();
        }
    }
    
    public void drawCaseMer(int x, int y,int cote){
        cg.drawImage(RessourcesImages.MER, x , y , cote, cote ,this);
    }
   
    //------------------Australie---------------------------------
    public void drawCaseAustralieOrientale(int x, int y,int cote){
        cg.drawImage(RessourcesImages.AUSTRALIEORIENTALE, x , y , cote, cote ,this);
    }
    
    public void drawCaseAustralieOccidentale(int x, int y,int cote){
        cg.drawImage(RessourcesImages.AUSTRALIEOCCIDENTALE, x , y , cote, cote ,this);
    }
    
    public void drawCaseIndonesie(int x, int y,int cote){
        cg.drawImage(RessourcesImages.INDONESIE, x , y , cote, cote ,this);
    }
    
    public void drawCaseNouvGuinee(int x, int y,int cote){
        cg.drawImage(RessourcesImages.NOUVGUINEE, x , y , cote, cote ,this);
    }
    
    //------------------Asie---------------------------------
    public void drawCaseAsieSudEst(int x, int y,int cote){
        cg.drawImage(RessourcesImages.ASIESUDEST, x , y , cote, cote ,this);
    }
    public void drawCaseSiberie(int x, int y,int cote){
        cg.drawImage(RessourcesImages.SIBERIE, x , y , cote, cote ,this);
    }
    public void drawCaseInde(int x, int y,int cote){
        cg.drawImage(RessourcesImages.INDE, x , y , cote, cote ,this);
    }
    public void drawCaseOural(int x, int y,int cote){
        cg.drawImage(RessourcesImages.OURAL, x , y , cote, cote ,this);
    }
    public void drawCaseChine(int x, int y,int cote){
        cg.drawImage(RessourcesImages.CHINE, x , y , cote, cote ,this);
    }
    public void drawCaseKamchatka(int x, int y,int cote){
        cg.drawImage(RessourcesImages.KAMCHATKA, x , y , cote, cote ,this);
    }
    public void drawCaseYakoutie(int x, int y,int cote){
        cg.drawImage(RessourcesImages.YAKOUTIE, x , y , cote, cote ,this);
    }
    public void drawCaseMongolie(int x, int y,int cote){
        cg.drawImage(RessourcesImages.MONGOLIE, x , y , cote, cote ,this);
    }
    public void drawCaseJapon(int x, int y,int cote){
        cg.drawImage(RessourcesImages.JAPON, x , y , cote, cote ,this);
    }
    public void drawCaseIrkoutsk(int x, int y,int cote){
        cg.drawImage(RessourcesImages.IRKOUTSK, x , y , cote, cote ,this);
    }
    public void drawCaseAfghanistan(int x, int y,int cote){
        cg.drawImage(RessourcesImages.AFGHANISTAN, x , y , cote, cote ,this);
    }
    public void drawCaseMoyenOrient(int x, int y,int cote){
        cg.drawImage(RessourcesImages.MOYENORIENT, x , y , cote, cote ,this);
    }
    
  //------------------Afrique---------------------------------
    public void drawCaseAfriqueNord(int x, int y,int cote){
        cg.drawImage(RessourcesImages.AFRIQUENORD, x , y , cote, cote ,this);
    }
    public void drawCaseAfriqueCentrale(int x, int y,int cote){
        cg.drawImage(RessourcesImages.AFRIQUECENTRALE, x , y , cote, cote ,this);
    }
    public void drawCaseAfriqueSud(int x, int y,int cote){
        cg.drawImage(RessourcesImages.AFRIQUESUD, x , y , cote, cote ,this);
    }
    public void drawCaseEgypte(int x, int y,int cote){
        cg.drawImage(RessourcesImages.EGYPTE, x , y , cote, cote ,this);
    }
    public void drawCaseMadagascar(int x, int y,int cote){
        cg.drawImage(RessourcesImages.MADAGASCAR, x , y , cote, cote ,this);
        
    }
    public void drawCaseAfriqueOrientale(int x, int y,int cote){
        cg.drawImage(RessourcesImages.AFRIQUEORIENTALE, x , y , cote, cote ,this);
    }
    
    //------------------Europe---------------------------------
    public void drawCaseGrandeBretagne(int x, int y,int cote){
        cg.drawImage(RessourcesImages.GRANDEBRETAGNE, x , y , cote, cote ,this);
    }
    public void drawCaseIslande(int x, int y,int cote){
        cg.drawImage(RessourcesImages.ISLANDE, x , y , cote, cote ,this);
    }
    public void drawCaseScandinavie(int x, int y,int cote){
        cg.drawImage(RessourcesImages.SCANDINAVIE, x , y , cote, cote ,this);
    }
    public void drawCaseRussie(int x, int y,int cote){
        cg.drawImage(RessourcesImages.RUSSIE, x , y , cote, cote ,this);
    }
    public void drawCaseEuropeNord(int x, int y,int cote){
        cg.drawImage(RessourcesImages.EUROPENORD, x , y , cote, cote ,this);
    }
    public void drawCaseEuropeOuest(int x, int y,int cote){
        cg.drawImage(RessourcesImages.EUROPEOUEST, x , y , cote, cote ,this);
    }
    public void drawCaseEuropeSud(int x, int y,int cote){
        cg.drawImage(RessourcesImages.EUROPESUD, x , y , cote, cote ,this);
    }
    
  //------------------Amérique du Nord---------------------------------
    public void drawCaseOntario(int x, int y,int cote){
        cg.drawImage(RessourcesImages.ONTARIO, x , y , cote, cote ,this);
    }
    public void drawCaseNordOuest(int x, int y,int cote){
        cg.drawImage(RessourcesImages.NORDOUEST, x , y , cote, cote ,this);
    }
    public void drawCaseAlberta(int x, int y,int cote){
        cg.drawImage(RessourcesImages.ALBERTA, x , y , cote, cote ,this);
    }
    public void drawCaseCanada(int x, int y,int cote){
        cg.drawImage(RessourcesImages.CANADA, x , y , cote, cote ,this);
    }
    public void drawCaseGroenland(int x, int y,int cote){
        cg.drawImage(RessourcesImages.GROENLAND, x , y , cote, cote ,this);
    }
    public void drawCaseEtatsUnisOuest(int x, int y,int cote){
        cg.drawImage(RessourcesImages.USAWEST, x , y , cote, cote ,this);
    }
    public void drawCaseEtatsUnisEst(int x, int y,int cote){
        cg.drawImage(RessourcesImages.USAEST, x , y , cote, cote ,this);
    }
    public void drawCaseAmeriqueCentrale(int x, int y,int cote){
        cg.drawImage(RessourcesImages.CENTRALE, x , y , cote, cote ,this);
    }
    public void drawCaseAlaska(int x, int y,int cote){
        cg.drawImage(RessourcesImages.ALASKA, x , y , cote, cote ,this);
    }
    //------------------Amérique du Sud---------------------------------
    public void drawCaseVenezuela(int x, int y,int cote){
        cg.drawImage(RessourcesImages.VENEZUELA, x , y , cote, cote ,this);
    }
    public void drawCaseBresil(int x, int y,int cote){
        cg.drawImage(RessourcesImages.BRESIL, x , y , cote, cote ,this);
    }
    public void drawCaseArgentine(int x, int y,int cote){
        cg.drawImage(RessourcesImages.ARGENTINE, x , y , cote, cote ,this);
    }
    public void drawCasePerou(int x, int y,int cote){
        cg.drawImage(RessourcesImages.PEROU, x , y , cote, cote ,this);
    }
    
    
    
    // -----------------------------------------------------------------------RESSOURCES TP5-----------------------
    public void drawSouris(int x, int y,int cote){
        cg.drawImage(RessourcesImages.SOURIS, x , y , cote, cote ,this);
    }
    
    public void drawChat(int x, int y,int cote){
        cg.drawImage(RessourcesImages.CHAT, x , y , cote, cote ,this);
    }
    
    public void drawCaseIn(int x, int y,int cote){
        this.drawCaseChemin(x, y, cote);
        cg.drawImage(RessourcesImages.IN, x , y , cote, cote ,this);
    }
    
    public void drawCaseOut(int x, int y,int cote){
        this.drawCaseChemin(x, y, cote);
        cg.drawImage(RessourcesImages.OUT, x , y , cote, cote ,this);
    }
    
    public void drawCaseChemin(int x, int y,int cote){
        cg.drawImage(RessourcesImages.CHEMIN, x , y , cote, cote ,this);
        
    }
    
    public void drawCaseFlecheHaut(int x, int y,int cote){
        Graphics2D g2d=(Graphics2D)cg;
        this.drawCaseChemin(x, y, cote);
        g2d.rotate(-Math.PI/2.d, x+cote/2, y+cote/2);
        cg.drawImage(RessourcesImages.FLECHE, x , y , cote, cote ,this);
        g2d.rotate(Math.PI/2.d, x+cote/2, y+cote/2);
        
    }


    public void drawCaseFlecheBas(int x, int y,int cote){
        Graphics2D g2d=(Graphics2D)cg;
        this.drawCaseChemin(x, y, cote);
        g2d.rotate(Math.PI/2.d, x+cote/2, y+cote/2);
        cg.drawImage(RessourcesImages.FLECHE, x , y , cote, cote ,this);
        g2d.rotate(-Math.PI/2.d, x+cote/2, y+cote/2);
    }
    
    public void drawCaseFlecheGauche(int x, int y,int cote){
        Graphics2D g2d=(Graphics2D)cg;
        this.drawCaseChemin(x, y, cote);
        g2d.rotate(Math.PI, x+cote/2, y+cote/2);
        cg.drawImage(RessourcesImages.FLECHE, x , y , cote, cote ,this);
        g2d.rotate(Math.PI, x+cote/2, y+cote/2);
    }
    
    public void drawCaseFlecheDroite(int x, int y,int cote){
        this.drawCaseChemin(x, y, cote);
        cg.drawImage(RessourcesImages.FLECHE, x , y , cote, cote ,this);
    }
}
