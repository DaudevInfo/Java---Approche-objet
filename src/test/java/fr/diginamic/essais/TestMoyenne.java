package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        CalculMoyenne tabDouble = new CalculMoyenne();

        System.out.println("Test de la fonction moyenne de la classe CalculMoyenne");
        tabDouble.ajout(100);
        tabDouble.ajout(200.2);
        System.out.println(tabDouble);

        System.out.println("Moyenne de 100 + 200.2 ="+ tabDouble.calcul());

        tabDouble.ajout(300);
        tabDouble.ajout(1000.2);
        System.out.println("Moyenne de 100 + 200.2 + 300 + 1000.2="+ tabDouble.calcul());

    }
}
