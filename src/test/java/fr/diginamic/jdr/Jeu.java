package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        /**
         * Méthode exécutable
         *
         */

        // On initialise le scanner qui va nous servir pour le menu
        Scanner scan = new Scanner(System.in);
        int choix = 0 ;
        int choix2 = 0;
        Personnage pers = null;
        Creature creature = null;
        boolean finCombat ;
        int attaquePersonnage ;
        int attaqueCreature ;



        while (choix !=4) {
            finCombat = false;
            // Lancement du jeu, on fait choisir un mode
            System.out.println("Menu");
            System.out.println("1 - Créer un personnage");
            System.out.println("2 - Score");
            System.out.println("3 - Combattre");
            System.out.println("4 - Sortir");
            System.out.print(" Choix: ");
            choix = scan.nextInt();

            switch (choix) {
                case 1:
                    pers = new Personnage();
                    System.out.println("Votre nouveau Personnage : "+pers);
                    break;
                case 2:
                    if (pers != null) {
                        System.out.println("Score :" + pers.getScore());
                    } else {
                        System.out.println("Il faut d'abord créer un personnage");
                    }
                    break;
                case 3:
                    if (pers != null) {
                        if (pers.getPtVie() <= 0) {
                            System.out.println("Votre personnage est décédé. Il a obtenu le score de "
                                    + pers.getScore()+ " points. Veuillez créer un nouveau personnage ");
                            break;
                        }
                    } else {
                        System.out.println("Il faut d'abord créer un personnage");
                        break;
                    }
                    do {
                        System.out.println("La forme de ton personnage actuel est de "+ pers);
                        System.out.println("Choix de la créature à attaquer");
                        System.out.println("1 - loup");
                        System.out.println("2 - gobelin");
                        System.out.println("3 - troll");
                        System.out.print(" Choix: ");
                        choix2 = scan.nextInt();

                        switch (choix2) {
                            case 1:
                                creature = new Loup();
                                System.out.println("Combat contre un Loup " + creature);
                                break;
                            case 2:
                                creature = new Gobelin();
                                System.out.println("Combat contre un Gobelin " + creature);
                                break;
                            case 3:
                                creature = new Troll();
                                System.out.println("Combat contre un troll " + creature);
                                break;
                        }

                        while (!finCombat && creature != null) {
                            attaquePersonnage = pers.getAttaque();
                            attaqueCreature = creature.getAttaque();

                            if (attaquePersonnage > attaqueCreature)
                            {
                                creature.setPtVie(creature.getPtVie()-attaquePersonnage +attaqueCreature);
                                if (creature.getPtVie() <= 0) {
                                    finCombat = true;
                                    pers.setScore(pers.getScore()+creature.getValGain());
                                };
                                System.out.println("Tu as gagné  Attaque de "+attaquePersonnage+ " contre "+attaqueCreature+  " => Points de Vie Personage : "+ pers.getPtVie() + "- Créature :"+creature.getPtVie());

                            } else if (attaquePersonnage < attaqueCreature) {

                                pers.setPtVie(pers.getPtVie()+attaquePersonnage -attaqueCreature);
                                if (pers.getPtVie() <= 0) {finCombat = true;};
                                System.out.println("Tu as perdu  Attaque de "+attaquePersonnage+ " contre "+attaqueCreature+  " => Points de Vie Personage : "+ pers.getPtVie() + "- Créature :"+creature.getPtVie());
                            } else {
                                System.out.println(" Attaque identique");
                            }

                        }
                        System.out.println("Score "+ pers.getScore());
                    } while (!finCombat);

                    break;
            }
        }
    }
}
