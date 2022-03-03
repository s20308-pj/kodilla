package pl.czaplinski.Klasy5;

class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    @Override
    public void payout() {
        System.out.println("Sending money to employee");

    }
}
