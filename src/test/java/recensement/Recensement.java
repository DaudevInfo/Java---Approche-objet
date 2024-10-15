package recensement;

import java.util.HashMap;
import java.util.Set;

public class Recensement {
    private HashMap <String, Ville> listeVille ;
    private HashMap <String, Departement> listeDept ;
    private HashMap <String, Region> listeRegion;

    public Recensement() {
        this.listeDept = new HashMap<>();
        this.listeVille = new HashMap<>();
        this.listeRegion = new HashMap<>();
    }

    /*
    A chaque demande d'ajout d'une ville, on vérifie l'existence des objets villes, dépt et région
    dans les liste du recensement
    - On ne charge pas les doublons villes
    - Si la région n'existe pas on la crée dans la liste des régions sinon on cumule le nbre d'habitants
    - Si le dpt n'existe pas on le crée dans la liste des villes sinon on cumule le nbre d'habitants
 */

    public void SetAjoutVille(String codeRegion, String nomRegion, String codeDepartement,  String codeCommune, String nomCommune, Integer populationCommune) {
        Departement departementLu = null;
        Ville villeLu = null ;
        Region regionLu = null;

        // On récupère region, ville et département s'ils existent
        if (listeRegion!= null) {
            regionLu = listeRegion.get(codeRegion);
        }
        if (listeDept != null) {
            departementLu = listeDept.get(codeDepartement);
        }
        if (listeVille != null) {
            villeLu =  listeVille.get(codeCommune);
        }


        if (villeLu == null) {

            if (departementLu != null) { // Département et région existent, on incrémente les compteurs habitants
                regionLu.setAjoutPopulation(populationCommune);
                departementLu.setAjoutPopulation(populationCommune);
                System.out.println(" region "+ regionLu + "pop "+ populationCommune);
            } else {
                // On crée l'occurrence pour ce dpt
                departementLu = listeDept.put(codeDepartement, new Departement(codeDepartement, populationCommune));

                if (regionLu == null) {
                    // On crée l'occurrence pour cette région
                    regionLu = listeRegion.put(codeRegion, new Region(codeRegion, nomRegion, populationCommune));
                } else { // La région existe, on incrémente le compteur habitant
                    regionLu.setAjoutPopulation(populationCommune);
                }
            }
            // On crée l'occurrence pour la ville
            listeVille.put(codeCommune, new Ville(regionLu, departementLu, codeCommune, nomCommune, populationCommune));
            }
    }

    public int getPopulationVille (String nomVille) {

        Set<String> listeCommune = listeVille.keySet();

        for (String code : listeCommune) {
            if (listeVille.get(code).getNomCommune().equals(nomVille))
                return listeVille.get(code).getPopulationTotale();
        }
        return 0;
    }

    public int getPopulationDpt (String nomDpt) {

        Set<String> liste = listeDept.keySet();

        for (String code : liste) {

            if (listeDept.get(code).getCodeDepartement().equals(nomDpt))
                return listeDept.get(code).getPopulationDepartement();
        }
        return 0;
    }

    public int getPopulationRegion (String nomRegion) {

        Set<String> liste= listeRegion.keySet();

        for (String code : liste) {
            if (listeRegion.get(code).getNomRegion().equals(nomRegion))
                return listeRegion.get(code).getPopulationRegion();
        }
        return 0;
    }
}
