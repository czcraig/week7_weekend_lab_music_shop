package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements ISell {


    private String type;
    private String colour;
    private double salePrice;
    private double costPrice;

    public Instrument(String type, String colour, double salePrice, double costPrice){
        this.type = type;
        this.colour = colour;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getSalePrice(){
        return salePrice;
    }


    public double getCostPrice() {
        return costPrice;
    }

    public double calculateMarkUp(){
        return getSalePrice() - getCostPrice();
    }



}
