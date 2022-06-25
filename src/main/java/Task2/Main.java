package Task2;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(500000);
        System.out.println(checkingAccount.getBalance());
        CreditAccount creditAccount = new CreditAccount();
        SavingsAccount savingsAccount = new SavingsAccount(50000);
        savingsAccount.pay(30000);
        savingsAccount.transfer(new CreditAccount(), 2000);
    }
}