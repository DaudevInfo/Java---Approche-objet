package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> listePays = new HashSet<>();
        Collections.addAll(listePays, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
        String maxLettres = "";
        System.out.println(listePays);

        for (String ville : listePays) {
            if (maxLettres.length() < ville.length()) maxLettres = ville;
        }
        listePays.remove(maxLettres);
        System.out.println(listePays);
    }
}
