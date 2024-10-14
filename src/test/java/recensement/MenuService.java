package recensement;

import java.util.Scanner;

public abstract class MenuService {
    Scanner scanner = new Scanner(System.in) ;

    public abstract void traiter(Recensement recensement, Scanner scanner) ;
}
