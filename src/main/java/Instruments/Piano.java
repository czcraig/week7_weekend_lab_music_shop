package Instruments;

import Instruments.Instrument;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String type, String colour, double salePrice, double costPrice, int numberOfKeys){
        super(type, colour, salePrice, costPrice);
        this.numberOfKeys = numberOfKeys;
    }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}