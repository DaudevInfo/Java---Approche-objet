package sets;

import java.text.NumberFormat;
import java.util.Locale;

public class Pays {
    private String nomPays;
    private double nbHabitants;
    private double pibHab;
    NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);

    public Pays(String nomPays, double nbHabitants, double pibHab) {
        this.nomPays = nomPays;
        this.nbHabitants = nbHabitants;
        this.pibHab = pibHab;
    }

    @Override
    public String toString() {
        return nomPays + ", " + nf.format(nbHabitants) +
                " hab., " + pibHab + "$ PIB/habitant \n";
    }

    public String getNomPays() {
        return nomPays;
    }

    public double getNbHabitants() {
        return nbHabitants;
    }

    public double getPibHab() {
        return pibHab;
    }
    public double getPIB() {
        return pibHab*nbHabitants;
    }
}
