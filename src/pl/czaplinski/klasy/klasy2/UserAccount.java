package pl.czaplinski.klasy.klasy2;

public class UserAccount {
    private int number;
    private int balance;

    public UserAccount(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
