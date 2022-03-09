package pl.czaplinski.klasy.klasy2;

public interface ATMInterface {
    void withdrawal(UserAccount userAccount, int cash);
    void deposit(UserAccount userAccount, int cash);
    default void bankConnection(){
        System.out.println("połączono z bankiem");
    }
    default void checkBalance(UserAccount userAccount){
        System.out.println("stan konta: " + userAccount.getBalance());
    }
    static void bankEndConnection(){
        System.out.println("zakończono połączneine z bankeim");
    }

}
