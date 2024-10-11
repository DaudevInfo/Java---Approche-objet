package automates;

import fichier.Ville;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static java.nio.file.Files.newDirectoryStream;

public class JeuDeLaVie {

    static final int tailleMaxX = 50;
    static final int tailleMaxY = 50;
    public static void main (String[] args) throws IOException, InterruptedException {

        Grille grilleInitiale = new Grille(tailleMaxX,tailleMaxY);
        Scanner scanner = new Scanner(System.in) ;
        int choix=0 ;

        /*
            Démarrage du jeu, on propose différents fichiers de paramétrage en entrée

         */
        Path pathRepParametre = Paths.get("C:/Dev/Code/Java - Approche objet/Jeu de lavie/fichier à charger");
        DirectoryStream <Path> listeRepParametre = newDirectoryStream(pathRepParametre);
        ArrayList <Path> listeChoix = new ArrayList<>();
        System.out.flush();
        Path pathFile = null;

        // Lancement du jeu, on fait choisir un mode
        System.out.println("Jeu de la vie - choisir un fichier à charger");
        Iterator <Path> iterator = listeRepParametre.iterator();

        while (iterator.hasNext()) {
            Path p = iterator.next();
            choix++;
            System.out.println(choix + " " + p);

            // Solution dégradé je n'ai pas réussi a gérer le remplacement de l'iterator au début
            listeChoix.add(p);
        }
        System.out.print(" Numéro: ");
        choix = scanner.nextInt();

        List <String> listeLignes = Files.readAllLines(listeChoix.get(choix-1));
        for(String ligne : listeLignes) {
            System.out.println(ligne);
        }
        if (!grilleInitiale.setChargementGrille(listeLignes)) {
            System.out.println("Mauvais format de fichier");
        } else {
            for (int i = 0; i < 100; i++) {
                System.out.print(grilleInitiale);
                grilleInitiale.setInitGrilleSuivante();
                Thread.currentThread().sleep(200);
            }
        }


    }
}
