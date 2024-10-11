package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path pathRecencemement = Paths.get("C:/Dev/Cours Diginamic/07 - Java approche POO/TP/recensement.csv");
        List <String> listeLignes = Files.readAllLines(pathRecencemement);
        ArrayList <String> listeLignesSortie = new ArrayList<>();
        Path pathCible = Paths.get("C:/Dev/Code/Java - Approche objet/ville25000.csv");
        ArrayList <Ville> listeVille = new ArrayList<>();
        listeLignesSortie.add("Nom de la ville , Code Département, nom Region, Population totale");

        // Exercice Lire Fichier
        // for(String ligne : listeLignes) {
            //System.out.println(ligne);
        //}
        // On supprime la première ligne du fichier
        listeLignes.remove(0);


        // Exercice  LireFichierAvecInstanciation
        for (String ligne : listeLignes) {
            String[] tokens = ligne.split(";");
            double nbHabitants =  Double.parseDouble(tokens[9].replaceAll(" ",""));
            if (nbHabitants > 25000) {
                listeVille.add(new Ville(tokens[6], tokens[2], tokens[1], nbHabitants));
                listeLignesSortie.add(tokens[6]+";"+ tokens[2]+";" + tokens[1]+ ";"+ nbHabitants);
            }
        }
        System.out.println(listeVille);
        Files.write(pathCible, listeLignesSortie, StandardOpenOption.APPEND);
    }
}

