package Tasks.Day35_Encapsulation;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);

    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber =  accountNumber;
    }


    public void deposit(double amount){
        if (amount<=0){
            System.err.println("Invalid Amount : "+ amount);
            System.exit(1);
        }
        System.out.println("Depositing $"+amount+" to the account "+ accountNumber);
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount<=0){
            System.err.println("Invalid Amount : "+ amount);
            System.exit(1);
        }
        System.out.println("Withdrawing $"+amount+ " from the account "+accountNumber);
        balance -= amount;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder = '" + accountHolder + '\'' +
                ", accountNumber = " + accountNumber +
                ", balance = $" + balance +
                '}';
    }
}
