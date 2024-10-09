package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class TestTri {
    public static void main(String[] args) {
        ArrayList<Ville> tabVille = new ArrayList<>();

        Collections.addAll(tabVille,
                new Ville("Nice", 343000),
                new Ville("Carcassonne",  47800),
                new Ville("Narbonne",  53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes",40600 )
        );
        System.out.println(tabVille);
        Collections.sort(tabVille);
        System.out.println(tabVille);

        System.out.println(tabVille);
        Collections.sort(tabVille,new ComparatorHabitant());
        System.out.println("\nTri par Habitant"+ tabVille);
        Collections.sort(tabVille,new ComparatorNom());
        System.out.println("\nTri par Nom"+ tabVille);


    }
}
