package recensement;

public class Region {
    private String codeRegion;
    private String nomRegion;
    private int populationRegion;

    public Region(String codeRegion, String nomRegion, int populationRegion ) {
        this.codeRegion = codeRegion;
        this.populationRegion = populationRegion;
        this.nomRegion = nomRegion;
    }

    public int getPopulationRegion() {
        return populationRegion;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setAjoutPopulation(int populationRegion) {

        this.populationRegion += populationRegion;

    }
}
