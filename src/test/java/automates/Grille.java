package automates;

import java.util.Arrays;
import java.util.List;



public class Grille {

    private Boolean [][] valGrille = new Boolean[0][0];

    public Grille(int maxX,int maxY) {
        for (int i = 0; i < maxX; i++) {
            this.valGrille = Arrays.copyOf(this.valGrille , this.valGrille .length + 1);
            this.valGrille [i] = new Boolean[0];
            for (int j = 0; j < maxY; j++) {
                this.valGrille [i] = Arrays.copyOf(this.valGrille [i], this.valGrille [i].length + 1);
                this.valGrille [i][j] = false;
            }
        }
    }

    /* Chargement de la grille
           On analyse le fichier, il doit être séparé par des ; et ne pas dépasser la taille max sur X,Y
           On centre la figure au milieu de la grille
     */
    public boolean setChargementGrille(List<String> listeLignes)
    {
        int deltaA ; // décalage des abscisses
        int deltaO ; // décalage des ordonnées


        if (listeLignes.size() > this.valGrille.length) return false;

        // On décale les abscisses pour centrer le tableau
        deltaA = (valGrille.length- listeLignes.size())/2 ;

        for (int i=0;  i < listeLignes.size(); i++) {
            String[] eltLigne = listeLignes.get(i).split(";");

            if (eltLigne.length > this.valGrille[i].length) return false;
            // On décale les ordonnées pour centrer le tableau
            deltaO = (valGrille[i].length- eltLigne.length)/2 ;

            for (int j = 0; j < eltLigne.length; j++) {
                if (eltLigne[j].equals("-")) {
                    this.valGrille[i+deltaA][j+deltaO] = false;
                } else if (eltLigne[j].equals("x")) {
                    this.valGrille[i+deltaA][j+deltaO] = true;

                } else {
                    System.out.println("val à pb " + eltLigne[j]);
                    return false;
                }
            }
        }
        return true;
    }

    /* Prépare le calcul de la prochaine itération
        - Une fonction qui calcule la valeur de tous les voisins
        - Une fonction qui déduit la valeur future en fonction de la valeur actuelle de la case
     */
    public int getValeurVoisinCase (int x, int y) {
        int valGlobale = 0;
        int a ; // valeur des abscisses
        int o ; // valeur des ordonnées

        for (int i = -1; i < 2; i++) { // On boucle sur les cases horizontales avant et apres
            for (int j = -1; j < 2; j++) { // On boucle sur les cases verticales avant et apres
                a= x+i;
                o= y+j;

                // On gère les débordements de tableaux
                if ( a > this.valGrille.length -1) a=0;
                if ( a < 0) a= valGrille.length -1;
                if ( o > valGrille[x].length -1) o=0;
                if ( o < 0) o= valGrille[x].length -1;

                if (( a != x || o != y) && this.valGrille[a][o]) { // on exclut la case elle-même dans la somme des valeurs
                    valGlobale ++;
                }

            }

        }
        //System.out.println("Voisin de "+ x+ " "+y + "Valgolobale "+valGlobale);
        return valGlobale;
    }

    /*
        On passe à la grille suivante

        On crée une grille temporaire, qu'on la charge avec les nouvelles valeurs
        puis on la recopie sur la grille courante

     */
    public void setInitGrilleSuivante () {
        Grille nextGrille = new Grille(this.valGrille.length, this.valGrille[0].length);
        for (int i = 0; i < this.valGrille.length; i++) {
            for (int j = 0; j < this.valGrille[i].length; j++) {
                int valVoisin = getValeurVoisinCase(i, j);
                nextGrille.valGrille[i][j] = this.valGrille[i][j];
                if (this.valGrille[i][j] && valVoisin != 2 && valVoisin != 3) {
                   // System.out.println("Passage à FAlSE Voisin de "+ i+ " "+j + " voisin :"+valVoisin+ "pt - Ancienne "+ this.valGrille[i][j] + " - Nouvelle "+ nextGrille.valGrille[i][j]);
                    //System.out.println(this.valGrille[i][j]+ " "+ (valVoisin != 2) + " " + (valVoisin != 3));
                    nextGrille.valGrille[i][j] = false;
                } else if (!this.valGrille[i][j] && (valVoisin == 3)) {
                    //System.out.println("Passage à TRUE Voisin de "+ i+ " "+j + " voisin :"+valVoisin+ "pt - Ancienne "+ this.valGrille[i][j] + " - Nouvelle "+ nextGrille.valGrille[i][j]);
                    // System.out.println(this.valGrille[i][j]+ " "+ (valVoisin != 2) + " " + (valVoisin != 3));
                    nextGrille.valGrille[i][j] = true;
                }
                //System.out.println("Voisin de "+ i+ " "+j + " voisin :"+valVoisin+ "pt - Ancienne "+ this.valGrille[i][j] + " - Nouvelle "+ nextGrille.valGrille[i][j]);
            }
        }

        for (int i = 0; i < this.valGrille.length; i++) {
            for (int j = 0; j < this.valGrille[i].length; j++) {
                this.valGrille[i][j] = nextGrille.valGrille[i][j];
            }
        }
    }

    @Override
    public String toString() {
        String tableau = "";
        for (int i = 0; i < valGrille.length; i++) {
            tableau += "\n";
            for (int j = 0; j < valGrille[i].length; j++) {
                if  (valGrille[i][j]) tableau += "|X";
                else tableau += "| ";
            }
            ;
        }
        return tableau;

    }
}
