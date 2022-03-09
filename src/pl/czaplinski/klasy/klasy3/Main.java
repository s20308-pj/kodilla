package pl.czaplinski.klasy.klasy3;

public class Main {
    public static void main(String[] args) {
        Knight knight1 = new Knight(new DeadIslandQuest());
        Knight knight2 = new Knight(new EliteKnightQuest());

    knight1.whereIsKnight();
    knight2.whereIsKnight();
    }
}
