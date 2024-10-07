package banques.entites;

public class Credit extends Operations{
    public Credit (String dateOperation, double montantOperation)
    {
        super(dateOperation, montantOperation);
        super.totalOperations +=montantOperation;

    }

    @Override
    public String getType() {
        return "Credit";
    }
}

