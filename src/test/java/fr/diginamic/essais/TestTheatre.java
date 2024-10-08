package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre th1 = new Theatre("Celestin", 100);


        while (th1.inscrire(15,10))
        {
            System.out.println(th1);
        }
        System.out.println("Fin des ventes ");
    }

}


