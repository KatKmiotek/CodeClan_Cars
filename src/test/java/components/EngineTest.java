package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {
    Engine engine;
    @Before
    public void before(){
        engine = new Engine(1.6, "electric");
    }
    @Test
    public void hasSize(){
        assertEquals(1.6, engine.getSize(), 0.01);
    }

}