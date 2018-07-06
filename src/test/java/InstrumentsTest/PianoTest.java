package InstrumentsTest;

import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;


    @Before
    public void before(){
        piano = new Piano("Grand", "Black", 1500, 1000, 88);
    }




    @Test
    public void canGetType() {
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(1500, piano.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(1000, piano.getCostPrice(), 0.01);
    }

    @Test
    public void canGetNoOfKey() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("ding ting ting ting ding", piano.play());
    }
}