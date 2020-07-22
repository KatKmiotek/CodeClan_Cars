package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyreTest {
    Tyre tyre;
    @Before
    public void before(){
        tyre = new Tyre("Goodyear", 185);
    }
    @Test
    public void hasSize(){
        assertEquals(185, tyre.getSize(), 0.01);
    }
}