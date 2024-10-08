package fr.diginamic.chaines;


/*  Création d'une classe dédiée pour récupérer le nom de la classe fille
    Je n'ai pas trouvé cette méthode (mais elle qui doit exister)

 */
public  class NomClasse {


    public static String NomFille(Object obj) {
        String nomClasse;
        nomClasse = String.valueOf(obj.getClass());
        return nomClasse.substring(nomClasse.lastIndexOf(".")+1);
    }

}


