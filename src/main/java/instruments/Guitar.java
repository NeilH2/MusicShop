package instruments;

import ShopManager.MarkUp;
import shop.ISell;

public class Guitar extends Instruments implements IPlay , ISell {

    private int numOfStrings;
    private double boughtFor;
    private double sellFor;

    public Guitar(int numOfStrings, String colour, String type, double boughtFor, double sellFor) {
        super(colour, type);
        this.numOfStrings = numOfStrings;
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public void setBoughtFor(double boughtFor) {
        this.boughtFor = boughtFor;
    }

    public double getSellFor() {
        return sellFor;
    }

    public void setSellFor(double sellFor) {
        this.sellFor = sellFor;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public String play() {
        return "string noise";
    }

    @Override
    public double calculateMarkup() {
        return sellFor - boughtFor;
    }
}

