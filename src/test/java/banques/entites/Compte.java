package banques.entites;

public class Compte {
    private String numCompte;
    private int solde;

    public Compte(String numCompte, int solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte='" + numCompte + '\'' +
                ", solde=" + solde +
                '}';
    }
}
