package pl.czaplinski.klasy.klasy7;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Tygrys");
        Animal elephant = new Elephant("Słoń");
        tiger.feed();
        tiger.feed();
        elephant.feed();
        elephant.addFood();
        elephant.feed();
        tiger.addFood();
        tiger.feed();
        tiger.addFood();

    }
}
