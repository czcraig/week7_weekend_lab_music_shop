package AccessoriesTest;

import Behaviours.ISell;

public abstract class Accessories implements ISell {

    private String type;
    private double salePrice;
    private double costPrice;

    public Accessories(String type, double salePrice, double costPrice){
        this.type = type;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
    }

    public String getType(){
        return type;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkUp(){
        return getSalePrice() - getCostPrice();
    }
}
