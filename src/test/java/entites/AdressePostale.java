package entites;

public class AdressePostale {
    int numeroRue ;
    String libelleRue ;
    int codePostal;
    String ville ;

    public AdressePostale (int numeroRue, String libelleRue, int codePostal, String ville)
    {
        this.numeroRue = numeroRue ;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville ;

    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
