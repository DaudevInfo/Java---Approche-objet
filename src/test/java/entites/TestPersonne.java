package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne("Durand", "jean") ;
        AdressePostale adr1 = new AdressePostale(10,"rue tata",87000, "Brest");
        Personne pers2 = new Personne("Dupont", "Pierre",adr1 ) ;

        pers1.getAffiche();
        pers1.setModifierNom("Duport");
        pers1.getAffiche();

        AdressePostale adr2 = new AdressePostale(14,"rue tonton",81000, "Nantes");
        pers1.setModifierAdresse(adr2);
        System.out.println(pers1);

    }

}
