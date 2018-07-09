import Behaviours.ISell;

import java.util.ArrayList;

public class RaysMusicExchange {
    public ArrayList<ISell> stock;



    public RaysMusicExchange(){
        this.stock = new ArrayList<ISell>();
    }

    public int getStockAmount(){
        return stock.size();
    }

    public void addToStock(ISell data){
        stock.add(data);
    }




}
