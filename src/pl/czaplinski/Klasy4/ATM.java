package pl.czaplinski.Klasy4;

class ATM extends Bank{
    @Override
    protected void requestCardInsert() {
        System.out.println("wprowadz kartę");
    }

    @Override
    protected void requestPINEnter() {
        System.out.println("podaj pin");
    }

    @Override
    protected void requestWithdrawalAmount() {
        System.out.println("wprowadz kwotę do wypłaty");
    }

    @Override
    protected void withdrawal() {
        System.out.println("wypłata");
    }

    @Override
    protected void finalInformation() {
        System.out.println("Dziękujemy za skorzystanie z usług banku");
    }
}
