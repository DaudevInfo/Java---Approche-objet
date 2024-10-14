package recensement;

public class Ville {
    Region region;
    Departement departement;
    int codeCommune;
    String nomCommune;
    int populationTotale;

    public Ville(Region region, Departement departement, int codeCommune, String nomCommune, int populationTotale) {
        this.region = region;
        this.departement = departement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
    }
}