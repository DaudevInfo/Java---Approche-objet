package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maMaison = new Maison();

        maMaison.ajouterPiece(new Salon(100, 0));
        maMaison.ajouterPiece(new WC(2, 0));
        maMaison.ajouterPiece(new SalleDeBain(100, 0));
        maMaison.ajouterPiece(new Cuisine(20, 0));
        maMaison.ajouterPiece(new Salon(100, 1));
        maMaison.ajouterPiece(new Chambre(20, 1));
        maMaison.ajouterPiece(new Chambre(100, 1));
        maMaison.ajouterPiece(new Chambre(20, 1));
        maMaison.ajouterPiece(new WC(10, 3));
        maMaison.ajouterPiece(null);
        maMaison.ajouterPiece(new WC(10, -1));
        maMaison.ajouterPiece(new WC(-1, 3));

        System.out.println(maMaison);
        for (int i = 0; i <= maMaison.getNbEtage(); i++) {
            System.out.println("Etage "+i + " - Superficie :"+ maMaison.superficie(i)+"m2");
        }
        System.out.println("Superficie totale : " + maMaison.superficie()+"m2");

        System.out.println("Superficie WC : " + maMaison.getSuperficieParTypePiece("WC")+"m2");
        System.out.println("Nombre Salon : " + maMaison.getNombreParTypePiece("Salon"));

    }

}
