package fr.diginamic.jdr;

import java.util.Random;

public abstract class Individu {
    private int force;
    private int ptVie;

    public Individu(int force,int ptVie) {
        this.ptVie = ptVie;
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public int getPtVie() {
        return ptVie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getAttaque () {
        return force+ new Random().nextInt(10)+1;
    }

    @Override
    public String toString() {
        return "force=" + force + ", ptVie=" + ptVie ;
    }
}
