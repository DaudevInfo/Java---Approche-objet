package tri;

import listes.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator <Ville> {

    @Override
    public int compare(Ville o1, Ville o2) {
        if (o1.getNbHabitant() > o2.getNbHabitant()) {
            return 1;
        } else if (o1.getNbHabitant() > o2.getNbHabitant()) {
            return -1;
        } else return 0;
    }
}
