package pl.czaplinski.klasy.klasy5;

class PieceWorkSalaryEmployee implements Employee {
    private static final double PRICE_FOR_ONE_PRODUCT = 5;
    private int numberOfProducts;

    public PieceWorkSalaryEmployee(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public double calculateSalary() {
        return this.numberOfProducts * PRICE_FOR_ONE_PRODUCT;
    }
}
