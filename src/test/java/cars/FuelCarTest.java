package cars;

import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FuelCarTest {
    FuelCar fuelCar;
    Engine engine;
    @Before
    public void before(){
        engine = new Engine(1.6, "petrol");
        fuelCar = new FuelCar(20000,"Red", engine);
    }
    @Test
    public void hasPrice(){
        assertEquals(20000, fuelCar.getPrice());
    }

}