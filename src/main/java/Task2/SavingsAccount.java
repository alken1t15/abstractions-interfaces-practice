package Task2;

public class SavingsAccount extends Account {
    public SavingsAccount() {
    }

    public int getBalance() {
        return balance;
    }

    private static int balance;

    public void setBalance(int balance) {
        SavingsAccount.balance = balance;
    }

    public SavingsAccount(int balance) {
        SavingsAccount.balance = balance;
    }

    @Override
    public void pay(int amount) {
        try {
            throw new MyError("Нельзя платить с этого счета");
        } catch (MyError e) {
            System.err.println("Нельзя платить с этого счета");
        }
        //TODO нельзя платить
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
        //TODO не может уходить в минус
    }

    @Override
    public void addMoney(int amount) {
        int temp = getBalance();
        setBalance(temp + amount);
        System.out.println("Счет был успешно пополнен");
    }
}