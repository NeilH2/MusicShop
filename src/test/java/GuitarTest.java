import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void Before(){
        guitar = new Guitar(4, "Blue", "String",10,20);
    }

    @Test
    public void guitarHasStrings(){
        assertEquals(4, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("string noise", guitar.play());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(10, guitar.calculateMarkup(), 0.0);
    }







}
