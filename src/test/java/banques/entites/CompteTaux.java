package banques.entites;

public class CompteTaux extends Compte{
    double tauxRemenuration;

    public CompteTaux (String numCompte, int solde, double tauxRemenuration)
    {
        super (numCompte,solde);
        this.tauxRemenuration = tauxRemenuration;
    }

    @Override
    public String toString() {
        return super.toString()+", tauxRemuneration= " + this.tauxRemenuration;
    }
}
