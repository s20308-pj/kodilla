package pl.czaplinski.klasy2;

public class Main {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount(123, 0);
        ATMImp atmImp = new ATMImp();

        atmImp.bankConnection();
        atmImp.deposit(userAccount, 100);
        atmImp.checkBalance(userAccount);
        atmImp.withdrawal(userAccount, 50);
        atmImp.checkBalance(userAccount);
        ATMInterface.bankEndConnection();
    }
}
