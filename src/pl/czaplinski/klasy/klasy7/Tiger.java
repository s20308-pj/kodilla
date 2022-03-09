package pl.czaplinski.klasy.klasy7;

class Tiger extends Animal {

    private int consumedFood;
    private int consumedWater;

    public Tiger(String name) {
        super(name);
    }

    public void feed() {
        setFood(getFood()-200);
        consumedFood += 200;
        setWater(getWater()-80);
        consumedWater += 80;
        System.out.println(getName() + " - nakarmiomo, zjadł: jedzenia: " + consumedFood + ", wody: " + consumedWater);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        //a)
        return super.toString();
        //b)
        // return getName() + " zjadł: " + consumedFood + " i wypił: " +consumedWater;
    }
}
