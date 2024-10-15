package recensement;

public class Departement {
    private String codeDepartement;

    private int populationDepartement;

    public Departement(String codeDepartement, int populationDepartement) {
        this.codeDepartement = codeDepartement;
        this.populationDepartement = populationDepartement;
    }

    public int getPopulationDepartement() {
        return populationDepartement;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }


    public void setAjoutPopulation(int populationDepartement) {
        this.populationDepartement += populationDepartement;
    }
}
