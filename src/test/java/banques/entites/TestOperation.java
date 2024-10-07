package banques.entites;

public class TestOperation {
    public static void main(String[] args) {
        Operations[] tabOper = { new Credit("1/1/2000",100.2),
        new Credit("1/2/2024", 1000),
        new Debit("2/2/2000", 50),
                new Debit("2/2/2000", 500)};

        for( Operations op : tabOper)  {
            System.out.println(op + " "+ op.getType());
        }
        System.out.println("montant total : "+ Operations.totalOperations);
    }
}
