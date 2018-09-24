import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        int result = waterBottle.getVolume();
        assertEquals(100, result);
    }

    @Test
    public void drink(){
        int result = waterBottle.drink();
        assertEquals(90, result);
    }

    @Test
    public void empty(){
        int result = waterBottle.empty();
        assertEquals(0, result);
    }

    @Test
    public void fill(){
        int result = waterBottle.fill();
        assertEquals(100, result);
    }
}
