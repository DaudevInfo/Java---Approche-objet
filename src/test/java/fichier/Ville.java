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

    public String getNom() {
        return nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public Double getPopulationTotale() {
        return populationTotale;
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
