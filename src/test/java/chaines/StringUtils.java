package chaines;

public class StringUtils {
    public static String append(Object ...objects){

        StringBuilder chaine = new StringBuilder();

        for (Object obj : objects)
        {
            chaine.append(obj.toString());
        }
        return chaine.toString();
    }
}
