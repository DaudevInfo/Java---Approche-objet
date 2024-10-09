package listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList <Integer> tabEntier = new ArrayList<>();
        Integer max = Integer.MAX_VALUE;
        Integer min = Integer.MIN_VALUE;
        Collections.addAll(tabEntier,-1 , 5, 7, 3, -2, 4, 8, 5);
        System.out.println(tabEntier);
        System.out.println("taille " + tabEntier.size());

        for(Integer i : tabEntier) {
            if (max < i) { max = i; } ;
        }
        System.out.println("Max : " + max);

        for(Integer i : tabEntier) {
            if (min > i) { min = i; } ;
        }
        tabEntier.remove(min) ;
        System.out.println(tabEntier);

        for (int i = 0; i < tabEntier.size(); i++) {
            Integer val = tabEntier.get(i);
            if (val < 0) tabEntier.set(i, -val) ;
        }
        System.out.println(tabEntier);

    }
}
