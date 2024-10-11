package maps;


import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapVilles {
    public static void main(String args[]) throws IOException {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
//TODO Développements à réaliser ci-dessous
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        Set <Integer> clesVilles = mapVilles.keySet();
        for (Integer cle: clesVilles)
        {
            System.out.println(cle + " " + mapVilles.get(cle));
        }
        System.out.println("Taille de la MAP : "+ mapVilles.size());


    // Exercice 4
    // Chargement de la structure Ville
        HashMap<String, Integer> mapVillesHabitant = new HashMap<>();
        int popMini= Integer.MAX_VALUE;
        String villeMiniPop ="";

        mapVillesHabitant.put("Nice",343000);
        mapVillesHabitant.put("Carcassonne",47800);
        mapVillesHabitant.put("Narbonne",53400);
        mapVillesHabitant.put("Lyon",484000);
        mapVillesHabitant.put("Foix",9700);
        mapVillesHabitant.put("Pau",77200);
        mapVillesHabitant.put("Marseille",850700);
        mapVillesHabitant.put("Tarbes",40600);

        Set <String> clesVillesHabitant = mapVillesHabitant.keySet();

        // On parcours la MAP est on stocke la ville ayant le moins d'habitant
        for (String cle : clesVillesHabitant)
        {
            if (popMini > mapVillesHabitant.get(cle)) {
                popMini= mapVillesHabitant.get(cle);
                villeMiniPop = cle;
            }
        }

        System.out.println(mapVillesHabitant);
        // OIn supprime la ville avec le moins d'habitant
        mapVillesHabitant.remove(villeMiniPop);
        System.out.println(mapVillesHabitant);

    }
}
