package pl.czaplinski.klasy.klasy6;

public class Main {
    public static void main(String[] args) {
        MySampleObject adam = new MySampleObject(1, "Adam");
        MySampleObject zenon = new MySampleObject(2, "Zenon");
        MySampleObject adam2 = adam;

        System.out.println(adam.hashCode());
        System.out.println(adam2.hashCode());
        System.out.println(zenon.hashCode());
        System.out.println(adam.equals(adam2));
        System.out.println(adam.equals(zenon));
    }
}
