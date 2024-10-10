package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        Path pathRecencemement = Paths.get("C:/Dev/Cours Diginamic/07 - Java approche POO/TP/recensement.csv");
        Path pathCible = Paths.get("C:/Dev/Code/Java - Approche objet/copie recensement.csv");
        List<String> listeLignesDepart = Files.readAllLines(pathRecencemement);
        List<String> listeLignesArrivee = new ArrayList<>();

        for(String ligne : listeLignesDepart) {
            System.out.println(ligne);
        }

        for (int i = 0; i < 100; i++) {
            listeLignesArrivee.add(listeLignesDepart.get(i));
        }
        Files.write(pathCible, listeLignesArrivee);
    }
}
