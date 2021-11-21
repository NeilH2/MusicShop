import org.junit.Before;
import org.junit.Test;
import shop.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void Before(){
        drumSticks = new DrumSticks(5, 8 );
    }

    @Test
    public void canGetBoughtFor(){
        assertEquals(5, drumSticks.getBoughtFor(), 0.0);
    }

    @Test
    public void canGetSellFor(){
        assertEquals(8, drumSticks.getSellFor(),0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3, drumSticks.calculateMarkup(), 0.0);
    }

}
