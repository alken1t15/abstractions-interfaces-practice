package Task2;

public class CheckingAccount extends Account {
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        CheckingAccount.balance = balance;
    }

    private static int balance;

    public CheckingAccount() {
    }

    public CheckingAccount(int balance) {
        CheckingAccount.balance = balance;
    }

    //TODO не может уходить в минус
    @Override
    public void pay(int amount) {
        int temp = getBalance();
        if (temp > amount) {
            setBalance(temp - amount);
            System.out.println("Оплата успешно прошла");
        } else {
            System.err.println("Оплата не прошла");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        int temp = getBalance();
        if (temp > amount) {
            if (account instanceof CreditAccount) {
                setBalance(temp - amount);
                new CreditAccount(amount);
                System.out.println("Перевод был сделан успешно");
            } else {
                setBalance(temp - amount);
                new CheckingAccount(amount);
                System.out.println("Перевод был сделан успешно");
            }
        } else {
            System.err.println("У вас не достаточно денег на счете");
        }
    }

    @Override
    public void addMoney(int amount) {
        int temp = getBalance();
        setBalance(temp + amount);
        System.out.println("Счет был успешно пополнен");
    }
}