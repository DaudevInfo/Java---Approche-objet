package banques.entites;

public class TestBanque {
    public static void main(String[] args) {

        Compte cpt1 = new Compte("AAA", 222);
        CompteTaux cpt2 = new CompteTaux("BBB",33,22.8);
        Compte[] array= {cpt1,cpt2} ;

        for (int i = 0; i < 2; i++) {
            System.out.println(array[i]);
        }


    }
}
