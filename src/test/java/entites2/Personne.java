package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom ="";
    public String prenom ="";
    public AdressePostale adresse = new AdressePostale(0,"",0,"");

    public Personne (String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne (String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse ;
    }

}
