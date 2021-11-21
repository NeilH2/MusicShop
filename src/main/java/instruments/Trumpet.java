package instruments;

import shop.ISell;

public class Trumpet extends Instruments implements IPlay, ISell {

    private int numOfValves;

    public Trumpet(int numOfValves, String colour, String type) {
        super(colour, type);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public void setNumOfValves(int numOfValves) {
        this.numOfValves = numOfValves;
    }


    public String play() {
        return "trumpet noise";
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
