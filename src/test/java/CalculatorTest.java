import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    //definition
    Calculator calculator;

    // definition + instantiation and initialization
    // Calculator calculator = new Calculator(10,5);

    @Before
    public void before(){
        //instantiation and initialization
        calculator = new Calculator(13,5);
    }

    @Test
    public void add(){
        double sum = calculator.add();
        assertEquals(18, sum,0);
    }

    @Test
    public void subtract(){
        double result = calculator.subtract();
        assertEquals(8, result,0);
    }

    @Test
    public void multiply(){
        double result = calculator.multiply();
        assertEquals(65, result,0);
    }

    @Test
    public void divide(){
        double result = calculator.divide();
        assertEquals(2.6, result, 0);
    }

}
