package ShopManager;

public abstract class MarkUp {

    private double boughtFor;
    private double sellFor;

    public MarkUp(double boughtFor, double sellFor) {
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

    public double calculateMarkup() {
        return sellFor - boughtFor;
    }
}
