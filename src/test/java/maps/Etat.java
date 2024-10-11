package maps;

// Je crée une classe Etat pour ne pas mélanger avec la classe Pays
// déjà existante dans le package sets
public class Etat {
    String nom;
    double nbHabitant;
    String continent;

    public Etat(String nom, double nbHabitant, String continent) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public double getNbHabitant() {
        return nbHabitant;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return continent + " " + nom + " :"+ String.format("%,.0f", nbHabitant) +"hab";
    }
}
