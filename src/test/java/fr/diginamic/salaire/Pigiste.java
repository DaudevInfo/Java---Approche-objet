package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private double montantJournalierRemunation;
    private int nbrJoursTravailles;

    public Pigiste(String nom, String prenom, double montantJournalierRemunation, int nbrJoursTravailles) {
        super(nom, prenom);
        this.montantJournalierRemunation = montantJournalierRemunation;
        this.nbrJoursTravailles = nbrJoursTravailles;
    }

    @Override
    public String toString() {
        return super.toString() + " montantJournalierRemunation = " + montantJournalierRemunation +
                " nbrJoursTravailles = " + nbrJoursTravailles;
    }

    @Override
    public double getSalaire() {
        return montantJournalierRemunation*nbrJoursTravailles;
    }


}
