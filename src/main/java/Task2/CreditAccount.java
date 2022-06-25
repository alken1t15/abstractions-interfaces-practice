package Task2;

public class CreditAccount extends Account {
    private static int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        CreditAccount.balance = balance;
    }

    public CreditAccount(int balance) {
        CreditAccount.balance = balance;
    }

    public CreditAccount() {
    }

    @Override
    public void pay(int amount) {
        int temp = getBalance();
        setBalance(temp - amount);
        //TODO Если платить, то я ухожу в минус
    }

    @Override
    public void transfer(Account account, int amount) {
        int temp = getBalance();
        if (account instanceof SavingsAccount) {
            setBalance(temp - amount);
            new SavingsAccount(amount);
            System.out.println("Перевод был сделан успешно");
        } else {
            setBalance(temp - amount);
            new CheckingAccount(amount);
            System.out.println("Перевод был сделан успешно");
        }
    }

    @Override
    public void addMoney(int amount) {
        int temp = getBalance();
        setBalance(temp + amount);
        System.out.println("Счет был успешно пополнен");
    }
}