package listes;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList <String> tabVille = new ArrayList <> ();
        String villePlusLongue = "";
        Collections.addAll(tabVille,"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        for (String ville : tabVille) {
            if (villePlusLongue.length() < ville.length()) villePlusLongue = ville;
        }
        System.out.println(villePlusLongue);

        for (int i = 0; i < tabVille.size(); i++) {
            tabVille.set(i, tabVille.get(i).toUpperCase());
        }
        System.out.println(tabVille);

        // Correctif j'aurais pu mettre ville.StartsWith()
        Iterator <String> iterVille = tabVille.iterator();
        while (iterVille.hasNext()) {
            String ville = iterVille.next();
            if (ville.indexOf('N') == 0) {
                iterVille.remove();
            }
        }
        System.out.println(tabVille);

    }
}
