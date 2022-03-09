package pl.czaplinski.klasy.klasy7;

abstract class Animal {
    private static int food;
    private static int water;
    private final String name;

    public Animal(String name) {
        Animal.food = 1000;
        Animal.water = 1000;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getFood() {
        return food;
    }

    public static int getWater() {
        return water;
    }

    public static void setFood(int food) {
        Animal.food = food;
    }

    public static void setWater(int water) {
        Animal.water = water;
    }

    public void feed() {
        food -= 200;
        water -= 200;
    }

    public static void addFood() {
        food += 500;
        water += 500;
        System.out.println("Dodałem jedzenie +500 oraz wodę +500, jest: " + food + " jedzenia i: " + water + " wody");
    }

    @Override
    public String toString() {
        return "pozostało jedzenia: "
                + food + " oraz wody: "
                + water;
    }
}
