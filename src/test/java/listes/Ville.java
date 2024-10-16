package listes;

import java.util.ArrayList;

public class Ville implements Comparable <Ville>{
    /** */
    private String nomVille;
    private int nbHabitant;


    public Ville(String nomVille, int nbHabitant) {
        this.nomVille = nomVille;
        this.nbHabitant = nbHabitant;

    }

    public int getNbHabitant() {
        return nbHabitant;
    }


    public String getNomVille() {
        return nomVille;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) obj;
        return (nomVille.equals(other.getNomVille()) && (other.nbHabitant == nbHabitant));
    }

    public void setNomVilleMajuscule() {
        this.nomVille = this.nomVille.toUpperCase();
    }
    @Override
    public String toString() {
        return nomVille + ", " + nbHabitant + " hab.";
    }

    @Override
    public int compareTo(Ville autre) {
        // Tri sur nom ville
        // return this.getNomVille().compareTo(autre.getNomVille());

        //Tri sur Nb Habitant
        if (this.getNbHabitant() > autre.getNbHabitant()) {
            return 1;
        } else if (this.getNbHabitant() < autre.getNbHabitant()) {
            return -1;
        }
        else return 0;

    }
}
