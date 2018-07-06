public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String type, String colour, double salePrice, double costPrice, int numberOfValves){
        super(type, colour, salePrice, costPrice);
        this.numberOfValves = numberOfValves;
    }


    public int getNumberOfValves() {
        return numberOfValves;
    }
}