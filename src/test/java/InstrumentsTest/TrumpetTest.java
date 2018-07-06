package InstrumentsTest;

import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;


    @Before
    public void before(){
        trumpet = new Trumpet("Piccolo", "Brass", 120, 80, 4);
    }




    @Test
    public void canGetType() {
        assertEquals("Piccolo", trumpet.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brass", trumpet.getColour());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(120, trumpet.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(80, trumpet.getCostPrice(), 0.01);
    }

    @Test
    public void canGetNoOfKey() {
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("beeewup bbbb beeb", trumpet.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(40, trumpet.calculateMarkUp(), 0.01);

    }
}