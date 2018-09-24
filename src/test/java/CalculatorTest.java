import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10,5);
    }

    @Test
    public void add(){
        double sum = calculator.add();
        assertEquals(15, sum,0);
    }

    @Test
    public void subtract(){
        double result = calculator.subtract();
        assertEquals(5, result,0);
    }

    @Test
    public void multiply(){
        double result = calculator.multiply();
        assertEquals(50, result,0);
    }

    @Test
    public void divide(){
        double result = calculator.divide();
        assertEquals(2, result, 0);
    }

}
