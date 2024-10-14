package recensement;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {
        Recensement recensEncours = new Recensement();
        Path pathRecencemement = Paths.get("C:/Dev/Cours Diginamic/07 - Java approche POO/TP/recensement.csv");
        List<String> listeLignes = readAllLines(pathRecencemement);

        Scanner scanner = new Scanner(System.in) ;
        int choix=0 ;
        /*
            Chargement du fichier recensement en cours dans l'objet recensement
            A chaque ligne, on vérifie l'existence des objets villes, dépt et région
            - On ne lit pas les doublons villes
            - Si la région n'existe pas on la crée sinon on cumule le nbre d'habitants
            - Si le dpt n'existe pas on le crée sinon on cumule le nbre d'habitants
         */
        listeLignes.remove(0); // Suppression de la ligne avec les entêtes de colonnes
        for (String ligne : listeLignes) {

            String[] elt = ligne.split(";");
            Integer coderegionLu = Integer.parseInt(elt[0].replaceAll(" ", ""));
            String codedeptLu = elt[2].replaceAll(" ", "");
            Integer codeCommuneLu = Integer.parseInt(elt[5].replaceAll(" ", ""));
            Integer populationCommune = Integer.parseInt(elt[9].replaceAll(" ", ""));
            recensEncours.SetAjoutVille(coderegionLu,elt[1],codedeptLu,elt[3],codeCommuneLu, elt[6], populationCommune);

        }

        while (choix == 9 )
        {
            System.out.println(" Menu");
            System.out.println("- 1. Population d’une ville donnée");
            System.out.println("- 2. Population d’un département donné");
            System.out.println("- 3. Population d’une région donnée");
            System.out.println("- 4. Afficher les 10 régions les plus peuplées");
            System.out.println("- 5. Afficher les 10 départements les plus peuplés");
            System.out.println("- 6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("- 7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("- 8. Afficher les 10 villes les plus peuplées de France\n");
            System.out.println("- 9. Sortir");

            switch (choix){
                case 1:
                    RecherchePopulationVille recherche = new RecherchePopulationVille();
                    recherche.traiter(recensement, scanner);
                    break;


            }

    }
}
