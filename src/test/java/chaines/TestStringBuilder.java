package chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder cumul1 = new StringBuilder();
        String cumul2 = "";

        /*
        long debut = System.currentTimeMillis();

        for (int i = 0; i < 100_000 ; i++) {
            cumul1.append(i);
        }
        long milieu = System.currentTimeMillis();
        for (int i = 0; i < 100_000 ; i++) {
            cumul2 += i;
        }
        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes :" + (milieu - debut)) ;
        System.out.println("Temps écoulé en millisecondes :" + (fin - milieu));
 */
        String nom = "durand";
        int age = 22;
        String ligne = StringUtils.append("Bonjour Mr", nom, "vous avez : ",age);
        System.out.println(ligne);
    }
}
