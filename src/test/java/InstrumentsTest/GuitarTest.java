package InstrumentsTest;

import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;


    @Before
    public void before(){
        guitar = new Guitar("Electric", "Black", 150, 100, 6);
    }




    @Test
    public void canGetType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(150, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(100, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void canGetNoOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }
}
