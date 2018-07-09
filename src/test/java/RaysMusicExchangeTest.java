import Behaviours.ISell;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RaysMusicExchangeTest {

   RaysMusicExchange raysMusicExchange;
   Guitar guitar;
   ArrayList<ISell>stock;



   @Before
   public void before(){
      raysMusicExchange = new RaysMusicExchange();
      stock = new ArrayList<>();
      guitar = new Guitar("b", "c", 20,10,6);
//


   }

   @Test

   public void canGetStockLevel() {
      assertEquals(0,raysMusicExchange.getStockAmount());
   }

   @Test
   public void canAddToStock() {
      raysMusicExchange.addToStock(guitar);
      assertEquals(1,raysMusicExchange.getStockAmount());
   }


}
