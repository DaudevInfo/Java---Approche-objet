package recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String nomVille;
        int population;

        System.out.println("Saisir nom de la ville");
        nomVille = scanner.next();
        population = recensement.getPopulationVille(nomVille);
        if (population == 0) {
            System.out.println("Ville non trouvée");
        } else {
            System.out.println("Population : "+ population );
        }
    }
}

