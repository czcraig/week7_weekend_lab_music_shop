package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument  implements IPlay{

    private int numberOfStrings;

    public Guitar(String type, String colour, double salePrice, double costPrice, int numberOfStrings){
        super(type, colour, salePrice, costPrice);
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "strum strum struuum";
    }



}
