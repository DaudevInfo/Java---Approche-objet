package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date dateJour = new Date();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateur.format(dateJour));

        Date date2 = new Date(116,4,19,23,59,30);
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formateur2.format(date2));

        Date date3 = new Date();
        System.out.println(formateur2.format(date3));
    }
}
