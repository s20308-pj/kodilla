package pl.czaplinski.klasy.klasy7;

class Elephant extends Animal {

    private int consumedFood;
    private int consumedWater;

    public Elephant(String name) {

        super(name);
    }

    public void feed() {
        setFood(getFood() - 400);
        consumedFood += 300;
        setWater(getWater() - 300);
        consumedWater += 300;
        System.out.println(getName() + " - nakarmiomo, zjadł: jedzenia: " + consumedFood + ", wody: " + consumedWater);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        //a)
        return super.toString();
        //b
        // return getName() + " zjadł: " + consumedFood + " i wypił: " +consumedWater;
    }
}
