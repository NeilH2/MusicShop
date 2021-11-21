import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TrumpetTest{


    Trumpet trumpet;


    @Before
    public void Before(){
        trumpet = new Trumpet(5, "Green", "Brass");
    }

    @Test
    public void trumpetHasValves(){
        assertEquals(5, trumpet.getNumOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("trumpet noise", trumpet.play());
    }

    @Test
    public void hasColour(){
        assertEquals("Green", trumpet.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", trumpet.getType());
    }





}
