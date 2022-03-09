package pl.czaplinski.wstepDoKol.kol1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        int total = 0;
        double average;
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = (random.nextInt(100));
        }
        for (int number : array) {
            System.out.print(number + "; ");
            total += number;
        }
        average = (double) total / array.length;
        System.out.println("\nsuma to: " + total + "\nilość liczb: " + array.length + "\nśrednia to: " + average);
    }
}
