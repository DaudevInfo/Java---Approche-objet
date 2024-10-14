package recensement;

import java.util.HashMap;
import java.util.Set;

public class Recensement {
    private HashMap <Integer, Ville> listeVille ;
    private HashMap <String, Departement> listeDept ;
    private HashMap <Integer, Region> listeRegion;

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

    public void SetAjoutVille(Integer codeRegion, String nomRegion, String codeDepartement, String nomDepartement , Integer codeCommune, String nomCommune, Integer populationCommune) {
        Departement departementLu = null;
        Ville villeLu = null ;
        Region regionLu = null;

        if (listeRegion!= null) {
            regionLu = listeRegion.get(codeRegion);
        }
        if (listeDept != null) {
            departementLu = listeDept.get(codeDepartement);
        }
        if (listeVille != null) {
            villeLu =  listeVille.get(codeCommune);
        }

        System.out.println(regionLu);
        System.out.println(departementLu);
        System.out.println(villeLu);

        if (villeLu == null) {
            if (departementLu != null) {
                regionLu.setAjoutPopulation(populationCommune);
                departementLu.setAjoutPopulation(populationCommune);
            } else {
                departementLu = listeDept.put(codeDepartement, new Departement(codeDepartement, nomDepartement, populationCommune));
                System.out.println("Création de département" +nomDepartement);
                if (regionLu == null) {
                    regionLu = listeRegion.put(codeRegion, new Region(codeRegion, nomRegion, populationCommune));
                    System.out.println("Création de région :" + nomRegion);
                } else {
                    regionLu.setAjoutPopulation(populationCommune);
                }
            }
            listeVille.put(codeCommune, new Ville(regionLu, departementLu, codeCommune, nomCommune, populationCommune));
            System.out.println("Création de ville"+ nomCommune);
        }
    }

    public int getPopulationVille (String nomVille) {
        Set<Integer> listeCommune = listeVille.keySet();
        for (Integer code : listeCommune) {
            if (listeVille.get(code).equals(nomVille)) return listeVille.get(code).populationTotale;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Recensement{" +
                "listeVille=" + listeVille +
                ", listeDept=" + listeDept +
                ", listeRegion=" + listeRegion +
                '}';
    }
}
