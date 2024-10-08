package fr.diginamic.jdr;

import java.util.Random;

public class Personnage extends Individu{
    private int score;

    public Personnage() {
        // On génère un nombre aléatoire entre 1 et 18 qu'on stocke dans ptVie
        // et un nombre aléatoire entre 20 et 50 qu'on stocke dans force
        super(new Random().nextInt(7) + 12, new Random().nextInt(31) + 20);
        // On force le score à 0
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
