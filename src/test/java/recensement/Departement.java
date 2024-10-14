package recensement;

public class Departement {
    private String codeDepartement;
    private String nomDepartement;
    private int populationDepartement;

    public Departement(String codeDepartement, String nomDepartement, int populationDepartement) {
        this.codeDepartement = codeDepartement;
        this.nomDepartement = nomDepartement;
        this.populationDepartement = populationDepartement;
    }

    public int getPopulationDepartement() {
        return populationDepartement;
    }

    public void setAjoutPopulation(int populationDepartement) {
        this.populationDepartement += populationDepartement;
    }
}
