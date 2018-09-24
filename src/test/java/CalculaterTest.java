import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculaterTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10,5);
    }

    @Test
    public void add(){
        int sum = calculator.add();
        assertEquals(15, sum);
    }

    @Test
    public void subtract(){
        int result = calculator.subtract();
        assertEquals(5, result);
    }

    @Test
    public void multiply(){
        int result = calculator.multiply();
        assertEquals(50, result);
    }

    @Test
    public void divide(){
        int result = calculator.divide();
        assertEquals(2, result);
    }

}
