package pl.czaplinski.klasy.klasy5;

class HourlySalaryEmployee implements Employee {
    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    @Override
    public double calculateSalary() {
        return this.hours * this.hourlyPay;
    }
}
