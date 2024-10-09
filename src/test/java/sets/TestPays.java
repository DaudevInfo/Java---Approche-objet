package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> listePays = new HashSet<>();
        Collections.addAll(listePays,
                new Pays("USA", 331002651, 63543),
                new Pays("France", 65273511, 43257),
                new Pays("Allemagne", 83783942, 50106),
                new Pays("UK", 67886011, 46413),
                new Pays("Italie", 60461826, 35470),
                new Pays("Japon", 126476461, 40193),
                new Pays("Chine", 1439323776, 12063),
                new Pays("Russie", 145912025, 11910),
                new Pays("Inde", 1380004385, 2170));

        System.out.println(listePays);



    }
}
