package fr.diginamic.jdr;

public class Creature extends Individu{
    private int valGain ;

    public Creature(int force, int ptVie, int valGain) {
        super(force, ptVie);
        this.valGain = valGain;
    }

    public int getValGain() {
        return valGain;
    }
}
