package AccessoriesTest;

import ShopAccessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;


    @Before
    public void before() {
        sheetMusic = new SheetMusic( "Sheet Music", 3, 1);
    }


    @Test
    public void canGetType() {
        assertEquals("Sheet Music", sheetMusic.getType());
    }


    @Test
    public void canGetSalePrice() {
        assertEquals(3, sheetMusic.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(1, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(2, sheetMusic.calculateMarkUp(), 0.01);

    }
}
