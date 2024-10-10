package fichier;

public class Ville {
    String nom;
    String codeDepartement ;
    String nomRegion;
    Double populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, Double populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "Ville " +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale=" + populationTotale +
                "\n";
    }
}
