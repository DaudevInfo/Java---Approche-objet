package listes;

public class Ville {
    private String nomVille;
    private int nbHabitant;

    public Ville(String nomVille, int nbHabitant) {
        this.nomVille = nomVille;
        this.nbHabitant = nbHabitant;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNomVilleMajuscule() {
        this.nomVille = this.nomVille.toUpperCase();
    }
    @Override
    public String toString() {
        return nomVille + ", " + nbHabitant + " hab.";
    }
}
