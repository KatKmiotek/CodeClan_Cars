package persons;

import behaviours.IBuy;
import cars.Car;

import java.util.ArrayList;

public class Customer implements IBuy {
    private String name;
    private int money;
    private ArrayList<Car> ownedVehicles;

    public Customer(String name, int money){
        this.money = money;
        this.name = name;
        this.ownedVehicles = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setOwnedVehicles(ArrayList<Car> ownedVehicles) {
        this.ownedVehicles = ownedVehicles;
    }
    public void buy(Car car){
        ownedVehicles.add(car);
        money -= car.getPrice();
    }
    public int carsCount(){
        return ownedVehicles.size();
    }
}
