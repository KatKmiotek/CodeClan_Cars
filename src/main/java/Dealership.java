import behaviours.IBuy;
import behaviours.ISell;
import cars.Car;
import persons.Customer;

import java.util.ArrayList;

public class Dealership implements IBuy, ISell {
    private ArrayList<Car> stock;
    private int till;
    private int damageCost;

    public Dealership(int till) {
        this.till = till;
        this.stock = new ArrayList<Car>();
        this.damageCost = 5000;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    @Override
    public void buy(Car car) {
        stock.add(car);
        till -= car.getPrice();
    }
    public int stockCount(){
        return stock.size();
    }

    @Override
    public void sell(Car car, Customer customer) {
        stock.remove(car);
        till += car.getPrice();
        customer.buy(car);
    }
    public void damageCar(Car car){
        car.addDamage();
//        this.stock.get(0) -= damageCost;
    }
}
