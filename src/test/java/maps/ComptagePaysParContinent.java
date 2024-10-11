package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList <Etat> listePays = new ArrayList<>();
        HashMap <String, Double> comptagePaysContinent = new HashMap<>();


        listePays.add(new Etat("France", 65_000_000, "Europe"));
        listePays.add(new Etat("Allemagne", 80_000_000, "Europe"));
        listePays.add(new Etat("Belgique", 10_000_000, "Europe"));
        listePays.add(new Etat("Russie", 150_000_000, "Asie"));
        listePays.add(new Etat("Chine", 1_400_000_000, "Asie"));
        listePays.add(new Etat("Indonésie", 220_000_000, "Océanie"));
        listePays.add(new Etat("Australie", 20_000_000, "Océanie"));

        for (Etat pays : listePays) {
            double valeurInit= 0;
            if (comptagePaysContinent.get(pays.continent) != null) {
                valeurInit = comptagePaysContinent.get(pays.continent);
            }
            comptagePaysContinent.put(pays.continent,valeurInit+ pays.getNbHabitant());
        }
        System.out.println(listePays);
        System.out.println(comptagePaysContinent);

    }
}
