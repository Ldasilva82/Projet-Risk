/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.vue;

import game.controler.AbstractControler;
import game.model.AbstractModel;
import game.vue.observer.Observateur;

/**
 *
 * @author david
 */
public class Vue extends javax.swing.JFrame implements Observateur{

    private AbstractModel model;
    private MouseListener mouseListener;
    private AbstractControler controler;
    /**
     * Creates new form 
     * @param model
     * @param controler
     */
    public Vue(AbstractModel model, AbstractControler controler) {
        this.model = model;
        this.controler = controler;
        initComponents();
        this.mouseListener = new MouseListener(controler);
        this.panelJeu.addMouseListener(this.mouseListener);
    }
    
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
        for(int xP=0; xP<model.getLargeur();xP++){
            for(int yP=0; yP<model.getHauteur();yP++){
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
    private void initComponents() {

        labelNbSourisIN = new javax.swing.JLabel();
        labelNbFleches = new javax.swing.JLabel();
        labelNbSourisOut = new javax.swing.JLabel();
        panelJeu = new game.vue.PanelJeu(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNbSourisIN.setText("jLabel1");

        labelNbFleches.setText("nbFleche");

        labelNbSourisOut.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelNbSourisIN, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNbSourisOut, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNbFleches, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelJeu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelJeu, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNbSourisIN)
                    .addComponent(labelNbFleches)
                    .addComponent(labelNbSourisOut)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelNbFleches;
    private javax.swing.JLabel labelNbSourisIN;
    private javax.swing.JLabel labelNbSourisOut;
    private game.vue.PanelJeu panelJeu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        repaint();
    }
}
