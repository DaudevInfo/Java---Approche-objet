package maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap <String, Double> mapSal = new HashMap<>();
        mapSal.put("Paul",1750.0);
        mapSal.put("Hicham",1825.0);
        mapSal.put("Yu",2250.0);
        mapSal.put("Ingrid",2015.0);
        mapSal.put("Chantal",2418.0);

        System.out.println(mapSal.size());
    }
}
