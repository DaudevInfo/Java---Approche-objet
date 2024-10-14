package listes;

public class TestEquals {
    public static void main(String[] args) {

        Ville v1 = new Ville ("Lyon", 500_000);
        //Ville v2 = new Ville ("Lyon", 500_000);
        Ville v2 = v1;
        System.out.println("Equals "+ v1.equals(v2));
        System.out.println("== " + (v1==v2));
    }




}
