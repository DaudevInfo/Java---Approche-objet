package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println("5,2 +7,8 = " + Operations.calcul(5.2, 7.8, '+'));
        System.out.println("5,2 -7,8 = "+ Operations.calcul(5.2,7.8, '-'));
        System.out.println("5,2 *7,8 = "+ Operations.calcul(5.2,7.8, '*'));
        System.out.println("5,2 /7,8 = "+ Operations.calcul(5.2,7.8, '/'));
        System.out.println("5,2 ?7,8 = "+ Operations.calcul(5.2,7.8, '?'));
    }
}
