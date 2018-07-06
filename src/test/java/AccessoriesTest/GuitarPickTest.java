package AccessoriesTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest {
    GuitarPick guitarPick;


    @Before
    public void before() {
        guitarPick = new GuitarPick( "Guitar Pick", 2, 1);
    }


    @Test
    public void canGetType() {
        assertEquals("Guitar Pick", guitarPick.getType());
    }


    @Test
    public void canGetSalePrice() {
        assertEquals(2, guitarPick.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(1, guitarPick.getCostPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1, guitarPick.calculateMarkUp(), 0.01);

    }
}

