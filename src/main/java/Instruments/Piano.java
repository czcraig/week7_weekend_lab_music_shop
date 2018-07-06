package Instruments;

import Behaviours.IPlay;
import Instruments.Instrument;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;

    public Piano(String type, String colour, double salePrice, double costPrice, int numberOfKeys){
        super(type, colour, salePrice, costPrice);
        this.numberOfKeys = numberOfKeys;
    }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "ding ting ting ting ding";
    }
}