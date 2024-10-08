package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature{

    public Troll() {
        // On génère un nombre aléatoire entre 20 et 30 qu'on stocke dans ptVie
        // et un nombre aléatoire entre 10 et 15 qu'on stocke dans force
        super(new Random().nextInt(6) + 10, new Random().nextInt(11) + 20,5);

    }
}
