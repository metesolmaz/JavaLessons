public class AccountManager {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if(balance >= amount) {
            balance = getBalance() - amount;
        }
        else {
            throw new BalanceInsufficentException("Bakiye yetersiz..");
        }

    }

}
