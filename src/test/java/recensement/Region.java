package recensement;

public class Region {
    private int codeRegion;
    private String nomRegion;
    private int populationRegion;

    public Region(int codeRegion, String nomRegion, int populationRegion ) {
        this.codeRegion = codeRegion;
        this.populationRegion = populationRegion;
        this.nomRegion = nomRegion;
    }

    public int getPopulationRegion() {
        return populationRegion;
    }

    public void setAjoutPopulation(int populationRegion) {
        this.populationRegion += populationRegion;
    }
}
