package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Pigiste pig1 = new Pigiste("Durand","Jean",15.3, 20);
        Salarie sal1 = new Salarie("Dupont", "Aude",2000.40);

        System.out.println(pig1 + " Salaire : " + pig1.getSalaire());
        System.out.println(sal1 + " Salaire : " + sal1.getSalaire());

        // Test pour afficherDonnées
        pig1.afficherDonnees();
        sal1.afficherDonnees();

    }
}
