package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet <Double> listeDouble = new HashSet<>();
        Collections.addAll(listeDouble,1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
        Double maxDouble = Double.MIN_VALUE;
        Double minDouble = Double.MAX_VALUE;

        for (Double eltDouble : listeDouble){
            if (maxDouble.doubleValue() < eltDouble.doubleValue()) maxDouble=eltDouble;
            if (minDouble.doubleValue() > eltDouble.doubleValue()) minDouble=eltDouble;
        }
        System.out.println(listeDouble);
        System.out.println("Min : "+minDouble+ " Max : "+ maxDouble);
        listeDouble.remove(minDouble);
        System.out.println(listeDouble);
    }
}
