package fr.diginamic.operations;

// Import de la classe Arrays pour pouvoir augmenter la taille du tableau
import java.util.Arrays;

public class CalculMoyenne {
    // Création d'un tableau vide
    double[] tableau = {};

    @Override
    public String toString() {
        return  Arrays.toString(tableau);
    }

    // Ajout d'élément dans le tableau avec augmentation de la taille
    public void ajout(double nbr) {
        tableau = Arrays.copyOf(tableau, tableau.length + 1);
        tableau [tableau.length-1] = nbr;
    }

    // Méthode de calcul de la moyenne des éléments du tableau
    public double calcul ()
    {
        int nbElt;
        double elt;
        double sommeElt= 0;

        for (nbElt = 0; nbElt < tableau.length; nbElt++) {
            sommeElt += tableau[nbElt];
        }
        return sommeElt/nbElt ;
    }
}
