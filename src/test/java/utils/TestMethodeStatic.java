package utils;
import java.lang.Integer;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int resultat;
        int a=2;
        int b= 100;

        resultat = Integer.parseInt(chaine);
        System.out.println(resultat);

        resultat = Integer.max(a,b);
        System.out.println(resultat);
    }
}
