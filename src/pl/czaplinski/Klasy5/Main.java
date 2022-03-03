package pl.czaplinski.Klasy5;

public class Main {
    public static void main(String[] args) {
//        PieceWorkSalaryEmployee pieceWorkSalaryEmployee = new PieceWorkSalaryEmployee(100);
        FixedWitchBonusSalaryEmployee fixedWitchBonusSalaryEmployee = new FixedWitchBonusSalaryEmployee(2000, true);
        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(fixedWitchBonusSalaryEmployee);

        processor.processPayout();

    }
}
