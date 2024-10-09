package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList <Ville> tabVille = new ArrayList<>();
        Ville villePlusPeuplee = new Ville("",0);
        Ville villeMoinsPeuplee = new Ville("",Integer.MAX_VALUE);

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

        for (Ville villeEnCours : tabVille)
        {
            if (villeEnCours.getNbHabitant() > villePlusPeuplee.getNbHabitant()) villePlusPeuplee= villeEnCours;
            if (villeEnCours.getNbHabitant() < villeMoinsPeuplee.getNbHabitant()) villeMoinsPeuplee= villeEnCours;
        }

        System.out.println(tabVille);
        System.out.println("+ Peuplée" + villePlusPeuplee);
        System.out.println("- Peuplée" + villeMoinsPeuplee);

        tabVille.remove(villeMoinsPeuplee);
        System.out.println(tabVille);

        for (Ville villeEnCours : tabVille)
        {
            if (villeEnCours.getNbHabitant() > 100000) villeEnCours.setNomVilleMajuscule();
        }
        System.out.println(tabVille);




    }
}
