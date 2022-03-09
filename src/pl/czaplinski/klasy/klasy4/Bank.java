package pl.czaplinski.klasy.klasy4;

abstract class Bank {
    protected abstract void requestCardInsert();
    protected abstract void requestPINEnter();
    protected abstract void requestWithdrawalAmount();
    protected abstract void withdrawal();
    protected abstract void finalInformation();
    private void informationAboutWithdrawal(){
        System.out.println("przyjęcie prośby o wypłate");
    }
    private void checkingBalanceAccount(){
        System.out.println("sprawdzenie możliwości wypłaty");
    }
    private void confirmationPossibilityOfWithdrawal(){
        System.out.println("potwierdzenie możliwości wypłaty");
    }

    public void transaction(){
        requestCardInsert();
        requestPINEnter();
        requestWithdrawalAmount();
        informationAboutWithdrawal();
        checkingBalanceAccount();
        confirmationPossibilityOfWithdrawal();
        withdrawal();
        finalInformation();
    }
}
