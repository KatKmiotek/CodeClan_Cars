package cars;

import components.Engine;

public abstract class Car {
    private int price;
    private String colour;
    Engine engine;
    private boolean damage;

    public Car(int price, String colour, Engine engine) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.damage = false;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean isDamage() {
        return damage;
    }

    public void setDamage(boolean damage) {
        this.damage = damage;
    }
    public void addDamage(){
        damage = true;
    }
}
