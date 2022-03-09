package pl.czaplinski.klasy.klasy5;

class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return this.salary;
    }
}
