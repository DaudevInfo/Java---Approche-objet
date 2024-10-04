package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne("Durand", "jean") ;
        AdressePostale adr1 = new AdressePostale(10,"rue tata",87000, "Brest");
        Personne pers2 = new Personne("Dupont", "Pierre",adr1 ) ;

    }

}
