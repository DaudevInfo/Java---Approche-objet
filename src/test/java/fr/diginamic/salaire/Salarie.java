package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    private double montantSalaireMensuel;

    public Salarie(String nom, String prenom, double montantSalaireMensuel) {
        super(nom, prenom);
        this.montantSalaireMensuel = montantSalaireMensuel;
    }

    @Override
    public double getSalaire() {
        return montantSalaireMensuel;
    }

    @Override
    public String toString() {
        return super.toString() + " montantSalaire = " + montantSalaireMensuel;
    }


}
