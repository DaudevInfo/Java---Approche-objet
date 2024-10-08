package fr.diginamic.maison;

public class Piece {
    private double superficie;
    private int etage;

    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }

    @Override
    public String toString() {

        return "Piece{" +
                "superficie=" + superficie +
                ", etage=" + etage +
                '}';
    }
}
