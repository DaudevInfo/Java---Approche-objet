package banques.entites;

public abstract class Operations {
    String dateOperation;
    double  montantOperation;
    static double totalOperations;

    public Operations (String dateOperation, double montantOperation)
    {
        this.dateOperation= dateOperation;
        this.montantOperation = montantOperation;
    }

    public String toString() {
        return getType()+ "\t"+ dateOperation + " " + montantOperation;
    }

    public abstract String getType();
}
