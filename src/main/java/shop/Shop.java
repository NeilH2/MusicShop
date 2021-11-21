package shop;


import java.util.ArrayList;


public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void add(ISell item) {
        this.stock.add(item);
    }

    public void remove(ISell item) {
        this.stock.remove(item);
    }

    public double getTotalProfit(){
        double total = 0;
        for(ISell item : stock ){
            total += item.calculateMarkup();
        }
        return total;
    }
}
