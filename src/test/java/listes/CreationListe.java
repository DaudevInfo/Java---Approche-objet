package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList <Integer> tabEntier = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            tabEntier.add(i);
        }
        System.out.println(tabEntier);

    }
}
