public class CheckingAccount extends BankAccount{

    static final double FEE = 0.15;

    public CheckingAccount(String name, double initialBalance){
        super(name, initialBalance);
        setAccountNumber(getAccountNumber() + "-10");
    }

    public boolean withdraw(double x){
        boolean withdrawl = super.withdraw(x + FEE);
        return  withdrawl;
    }
}
