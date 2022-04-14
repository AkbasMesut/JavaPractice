package Tasks.Day35_Encapsulation;

public class BankAccountObject {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Mesut",135454,120000);

        bankAccount.deposit(50000);
        bankAccount.withdraw(25000);

        System.out.println(bankAccount);


    }
}
