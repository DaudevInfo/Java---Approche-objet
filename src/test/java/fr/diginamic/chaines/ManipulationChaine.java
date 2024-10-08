package fr.diginamic.chaines;

import entites.Salaire;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        String nomFamille;
        String [] resultatSplit = new String[3];
        String montSalaire;

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère : " + premierCaractere);

        System.out.println("longueur de la chaine de caractères : "+ chaine.length());
        System.out.println("afficher l’index du premier « ; » : "+ chaine.indexOf(';'));

        nomFamille = chaine.substring (0,chaine.indexOf(';'));
        System.out.println("Nom de famille : "+ nomFamille);
        System.out.println("Nom de famille majuscule : "+ nomFamille.toUpperCase());
        System.out.println("Nom de famille minuscule: "+ nomFamille.toLowerCase());

        System.out.println("tableau issu de la chaine :" + Arrays.toString(chaine.split(";")));

        // Création de l'instance Salaire à partir des éléments de la chaine
        resultatSplit = chaine.split(";"); // Séparation des éléments séparés par ;
        montSalaire = resultatSplit[2].replace(" ",""); // suppression du " "

        Salaire sal1 = new Salaire(resultatSplit[0], resultatSplit[1], Double.parseDouble(montSalaire));
        System.out.println(sal1);

    }
}
