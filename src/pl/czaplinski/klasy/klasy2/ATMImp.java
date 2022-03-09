package pl.czaplinski.klasy.klasy2;

public class ATMImp implements ATMInterface {

    @Override
    public void withdrawal(UserAccount userAccount, int cash) {
        userAccount.setBalance(userAccount.getBalance() - cash);
    }

    @Override
    public void deposit(UserAccount userAccount, int cash) {
        userAccount.setBalance(userAccount.getBalance() + cash);
    }
}
