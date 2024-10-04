package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne() ;
        Personne pers2 = new Personne() ;
        pers1.nom = "DURAND";
        pers1.prenom = "Jean";
        pers1.adresse.numeroRue = 2;
        pers1.adresse.libelleRue= "rue toto";
        pers1.adresse.codePostal = 64000;
        pers1.adresse.ville = "Lyon";
        pers2.nom = "DUPONT";
        pers2.prenom = "Jerome";
        pers2.adresse.numeroRue = 9;
        pers2.adresse.libelleRue= "rue titi";
        pers2.adresse.codePostal = 60000;
        pers2.adresse.ville = "Paris";
    }

}
