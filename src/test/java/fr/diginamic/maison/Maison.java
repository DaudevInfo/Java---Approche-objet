package fr.diginamic.maison;

import fr.diginamic.chaines.NomClasse;

import java.util.Arrays;

public class Maison {
    private Piece[] listePiece = new Piece[0];

    public void ajouterPiece (Piece piece) {
        if (piece != null) {
            if (piece.getEtage() >= 0 && piece.getSuperficie() >=0 ) {
                listePiece = Arrays.copyOf(listePiece, listePiece.length + 1);
                listePiece[listePiece.length - 1] = piece;
            }
        }
    }

    // Methode de calcul de la superficie totale de la maison
    public double superficie () {
        double superficie =0;
        for (Piece piece :listePiece)
        {
            superficie += piece.getSuperficie();
        }
        return superficie;
    }

    // Retourne le nombre d'étage de la maison
    public int getNbEtage () {
        int maxEtage = 0 ;
        for (Piece piece :listePiece)
        {
            if (piece.getEtage() > maxEtage) {maxEtage = piece.getEtage();}
        }
        return maxEtage;
    }
    // Methode de calcul de la superficie totale d'un étage
    public double superficie (int etage) {
        double superficie =0;
        for (Piece piece :listePiece)
        {
            if (piece.getEtage() == etage) {superficie += piece.getSuperficie();}
        }
        return superficie;
    }

    // Methode de calcul de la superficie totale des pièces d'un certain type
        public double getSuperficieParTypePiece(String typePiece) {
        double superficie =0;
        for (Piece piece :listePiece)
        {
            if (NomClasse.NomFille(piece).equals(typePiece)) {superficie += piece.getSuperficie();}
        }
        return superficie;

    }

    // Methode de calcul du nombre de pièces d'un certain type
    public int getNombreParTypePiece(String typePiece) {
        int nbPiece =0;
        for (Piece piece :listePiece)
        {
            if (NomClasse.NomFille(piece).equals(typePiece)) {nbPiece += 1;}
        }
        return nbPiece;

    }

    @Override
    public String toString() {
        String info;
        Class testClass;
        info = "Maison "  ;
        // Affichage de chaque pièces : type, étage et superficie
        for (int i = 0; i < listePiece.length; i++) {
            //testClass = listePiece[i].getClass();
            info += "Pieces "+ i+ " "+ NomClasse.NomFille(listePiece[i])+ ", Etage : " + listePiece[i].getEtage() +
                    ", Superficie = "+ listePiece[i].getSuperficie()+ "\n" ;
        }
        return info;
    }


}
