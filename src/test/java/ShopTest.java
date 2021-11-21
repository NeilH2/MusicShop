import instruments.Guitar;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shop.DrumSticks;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Shop shop;
    DrumSticks drumSticks;
    Trumpet trumpet;


    @Before
    public void Before(){
        guitar = new Guitar(4,"Pink","String",10,20);
        drumSticks = new DrumSticks(5,8);
        shop = new Shop();
        trumpet = new Trumpet(6,"Brown","Brass");
    }

    @Test
    public void stockStartEmpty() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock(){
        shop.add(drumSticks);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop.add(drumSticks);
        shop.add(guitar);
        shop.add(trumpet);
        shop.remove(drumSticks);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canGetTotalProfit(){
        shop.add(drumSticks);
        shop.add(guitar);
        assertEquals(13, shop.getTotalProfit(), 0.0 );


    }




}






