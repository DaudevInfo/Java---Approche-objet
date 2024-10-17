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
        int i= 0;
        listeLignes.remove(0); // Suppression de la ligne avec les entêtes de colonnes
        for (String ligne : listeLignes) {

            String[] elt = ligne.split(";");
            String coderegionLu = elt[0].replaceAll("[^0-9]", "");
            String codedeptLu = elt[2].replaceAll("[^0-9]", "");
            String codeCommuneLu = elt[5].replaceAll("[^0-9]", "");
            Integer populationCommune = Integer.parseInt(elt[9].replaceAll(" ", ""));
            recensEncours.SetAjoutVille(coderegionLu,elt[1],codedeptLu,codeCommuneLu, elt[6], populationCommune);
            i++;
            if (i <1000 ) System.out.println("nbr lignes lues "+i +" Nbr de lignes chargées"+recensEncours.getListeVille().size());
        }
        System.out.println("nbr lignes lues "+i +" Nbr de lignes chargées"+recensEncours.getListeVille().size());
        recensEncours.getTotalRegion();

        while (choix != 9 ) {
            System.out.println(" Menu");
            System.out.println("- 1. Population d’une ville donnée");
            System.out.println("- 2. Population d’un département donné");
            System.out.println("- 3. Population d’une région donnée");
            System.out.println("- 4. Afficher les 10 régions les plus peuplées");
            System.out.println("- 5. Afficher les 10 départements les plus peuplés");
            System.out.println("- 6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("- 7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("- 8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("- 9. Sortir");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    RecherchePopulationVille recherche = new RecherchePopulationVille();
                    recherche.traiter(recensEncours, scanner);
                    break;
                case 2:
                    RechercherPopulationDepartement recherche2 = new RechercherPopulationDepartement();
                    recherche2.traiter(recensEncours, scanner);
                    break;
                case 3:
                    RechercherPopulationRegion recherche3 = new RechercherPopulationRegion();
                    recherche3.traiter(recensEncours, scanner);
                    break;

            }
        }
    }
}
