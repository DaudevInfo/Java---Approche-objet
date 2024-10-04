package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom ;
    public String prenom;
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
    public void getAffiche(){
        System.out.println("Nom : "+nom.toUpperCase()+ "- Prenom :"+prenom);
    }
    public void setModifierNom(String nom){
        this.nom = nom;
    }
    public void setModifierPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setModifierAdresse(AdressePostale adresse){
        this.adresse = adresse;
    }
    public String getPrenom(){
        return this.prenom ;
    }
    public String getNom(){
        return this.nom ;
    }
    public AdressePostale getAdresse(){
        return this.adresse ;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
