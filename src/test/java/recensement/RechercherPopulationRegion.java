package recensement;

import java.util.Scanner;

public class RechercherPopulationRegion extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String nomRegion;
        int population;

        System.out.println("Saisir nom de la Région");
        nomRegion = scanner.next();
        population = recensement.getPopulationRegion(nomRegion);
        if (population == 0) {
            System.out.println("Région non trouvée");
        } else {
            System.out.println("Population : "+ population );
        }

    }

}
