package persons;

import cars.FuelCar;
import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;
    FuelCar fuelCar;
    Engine engine;

    @Before
    public void before(){
        customer = new Customer("Tom", 30000);
        engine = new Engine(1.6, "petrol");
        fuelCar = new FuelCar(20000,"Red", engine);
    }
    @Test
    public void canBuyCar() {
        customer.buy(fuelCar);
        assertEquals(1, customer.carsCount());
        assertEquals(10000, customer.getMoney());
    }

    @Test
    public void getCarsCount() {
        assertEquals(0, customer.carsCount());
    }
}