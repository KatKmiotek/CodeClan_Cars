import cars.FuelCar;
import components.Engine;
import org.junit.Before;
import org.junit.Test;
import persons.Customer;

import static org.junit.Assert.*;

public class DealershipTest {

    Dealership dealership;
    FuelCar fuelCar;
    Engine engine;
    Customer customer;

    @Before
    public void before(){
        engine = new Engine(1.6, "petrol");
        fuelCar = new FuelCar(20000,"Red", engine);
        dealership = new Dealership(100000);
        customer = new Customer("Bob", 30000);
    }

    @Test
    public void buy() {
        dealership.buy(fuelCar);
        assertEquals(1, dealership.stockCount());
        assertEquals(80000, dealership.getTill());
    }
    @Test
    public void canSell(){
        dealership.buy(fuelCar);
        dealership.buy(fuelCar);
        dealership.sell(fuelCar, customer);
        assertEquals(1, dealership.stockCount());
        assertEquals(80000, dealership.getTill());
        assertEquals(1, customer.carsCount());
        assertEquals(10000, customer.getMoney());
    }
    @Test
    public void canDamageCar(){
        dealership.buy(fuelCar);
        dealership.damageCar(fuelCar);
        assertEquals(15000, fuelCar.getPrice());
    }
}