package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature{

    public Loup() {
        // On génère un nombre aléatoire entre 5 et 10 qu'on stocke dans ptVie
        // et un nombre aléatoire entre 3 et 8 qu'on stocke dans force
        super(new Random().nextInt(6) + 3, new Random().nextInt(6) + 5, 1);

    }
}
