package entites;

public class Theatre {
    String nom;
    int capacite;
    int totalClientInscrit ;
    double recette;

    public Theatre(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }

    // Permet d'inscrire de nouveaux clients en calculant l'augmentation de la recette
    // Si le nombre de places max est atteint retourne faux
    public boolean inscrire(int nbClient, double prixPlace)
    {
        if (totalClientInscrit+nbClient < capacite) {
            recette += nbClient*prixPlace;
            totalClientInscrit +=nbClient;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Theatre"+ nom  + ", capacite=" +capacite+", totalClientInscrit=" + totalClientInscrit +
                ", recette=" + recette ;
    }
}
