package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List <String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List <String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List <String> liste3 = new ArrayList<String>();
        /* Avec boucles
        for(String elt : liste1){

            liste3.add(elt);
        }
        for(String elt : liste2){
            liste3.add(elt);
        }
        */

        liste3.addAll(liste1);
        liste3.addAll(liste2);
        System.out.println(liste3);
    }

}
