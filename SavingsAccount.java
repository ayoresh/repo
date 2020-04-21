public class SavingsAccount extends BankAccount{

    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber = "";


    public SavingsAccount(String name, double initialBalance){
        super(name, initialBalance);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest(){
        double x = getBalance() * (1 + (rate / 12));
        setBalance(x);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount old, double initialBalance){
        super(old, initialBalance);
        savingsNumber = old.savingsNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }


}
