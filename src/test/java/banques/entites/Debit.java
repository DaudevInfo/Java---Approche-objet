package banques.entites;

public class Debit extends Operations{
    public Debit (String dateOperation, double montantOperation)
    {
        super(dateOperation, montantOperation);
        super.totalOperations -=montantOperation;
    }

    @Override
    public String getType() {
        return "Debit";
    }

}
