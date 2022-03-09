package pl.czaplinski.wstepDoKol.kol2a;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> gradeList = new ArrayList<>();
        Random random = new Random();
        int highestGrade = 1;
        int lowestGrade = 6;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            gradeList.add(random.nextInt(1, 7));
        }
        for (int mark : gradeList) {
            if (highestGrade <= mark) {
                highestGrade = mark;
            }
            if (lowestGrade >= mark) {
                lowestGrade = mark;
            }
            sum += mark;
            System.out.print(mark + ";");
        }
        System.out.println("\nnajniższa: " + lowestGrade + ", najwyższa: " + highestGrade);
        double avarage = (double) (sum - highestGrade - lowestGrade) / (gradeList.size() - 2);

        System.out.printf("średnia to: %.2f", avarage);
    }
}
