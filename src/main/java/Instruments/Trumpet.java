package Instruments;

import Behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;
    private IPlay play;

    public Trumpet(String type, String colour, double salePrice, double costPrice, int numberOfValves){
        super(type, colour, salePrice, costPrice);
        this.numberOfValves = numberOfValves;
    }


    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "beeewup bbbb beeb";

    }
}