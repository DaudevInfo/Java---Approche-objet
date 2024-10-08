package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature{

    public Gobelin() {
        // On génère un nombre aléatoire entre 10 et 15 qu'on stocke dans ptVie
        // et un nombre aléatoire entre 5 et 10 qu'on stocke dans force
        super(new Random().nextInt(6) + 5, new Random().nextInt(6) + 10, 2);

    }
}
