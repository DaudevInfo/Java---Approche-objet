package entites;

public class AdressePostale {
    int numeroRue = 0 ;
    String libelleRue = "";
    int codePostal = 0;
    String ville ;

    public AdressePostale (int numeroRue, String libelleRue, int codePostal, String ville)
    {
        this.numeroRue = numeroRue ;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville ;

    }
}
