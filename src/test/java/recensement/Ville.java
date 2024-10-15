package recensement;

public class Ville {
    private Region region;
    private Departement departement;
    private String codeCommune;
    private String nomCommune;
    private int populationTotale;

    public Ville(Region region, Departement departement, String codeCommune, String nomCommune, int populationTotale) {
        this.region = region;
        this.departement = departement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
    }

    public Region getRegion() {
        return region;
    }

    public Departement getDepartement() {
        return departement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }
}