package models;

public class Account {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private boolean hasEnoughMoney(int amount) {
        return this.balance >= amount;
    }

    public boolean withdraw(int amount) {
        if (!hasEnoughMoney(amount)) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
