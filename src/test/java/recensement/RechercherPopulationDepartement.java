package recensement;

import java.util.Scanner;

public class RechercherPopulationDepartement extends MenuService{


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        String nomDpt;
        int population;

        System.out.println("Saisir nom du département");
        nomDpt = scanner.next();
        population = recensement.getPopulationDpt(nomDpt);
        if (population == 0) {
            System.out.println("Département non trouvée");
        } else {
            System.out.println("Population : "+ population );
        }

    }
}
