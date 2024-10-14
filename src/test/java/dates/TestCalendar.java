package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Locale.CHINESE;
import static java.util.Locale.FRANCE;

public class TestCalendar {
    public static void main(String[] args) {
        Locale russe = Locale.of("Ru");
        Calendar cal = Calendar.getInstance();
        Date dateJour = cal.getTime();
        cal.set(2016,4,19,23,59,30);
        Date date2 = cal.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        SimpleDateFormat formateurF = new SimpleDateFormat(" EEEE dd MMMM yyyy",FRANCE);
        SimpleDateFormat formateurR = new SimpleDateFormat(" EEEE dd MMMM yyyy",russe);
        SimpleDateFormat formateurC = new SimpleDateFormat(" EEEE dd MMMM yyyy",CHINESE);

        System.out.println(formateur.format(date2));
        System.out.println(formateur2.format(dateJour));

        System.out.println("Français " + formateurF.format(dateJour));
        System.out.println("Chinois " + formateurC.format(dateJour));
        System.out.println("Russe " + formateurR.format(dateJour));
    }

}
