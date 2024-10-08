package fr.diginamic.salaire;

import java.util.Arrays;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return nom + " "+ prenom ;
    }

    public abstract double getSalaire();

    public void afficherDonnees () {
        String nomClasse;
        String classeFille;

        nomClasse = String.valueOf(this.getClass());
        classeFille = nomClasse.substring(nomClasse.lastIndexOf(".")+1);
        System.out.println(nom+ " " + prenom + " "+ getSalaire() + " Statut : "+ classeFille);
    };
}
