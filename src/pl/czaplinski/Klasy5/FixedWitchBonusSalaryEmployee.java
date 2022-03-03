package pl.czaplinski.Klasy5;

class FixedWitchBonusSalaryEmployee implements Employee {

    private double salary;
    private boolean isSellAdditionalProduct;

    public FixedWitchBonusSalaryEmployee(double salary, boolean isSellAdditionalProduct) {
        this.salary = salary;
        this.isSellAdditionalProduct = isSellAdditionalProduct;
    }

    @Override
    public double calculateSalary() {
        if (isSellAdditionalProduct) {
            return this.salary + this.salary * 0.2;
        } else {
            return this.salary;
        }
    }
}
