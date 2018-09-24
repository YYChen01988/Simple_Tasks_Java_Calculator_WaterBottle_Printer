import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500);
    }

    @Test
    public void getPaperStock(){
        int result = printer.getPaperStock();
        assertEquals(500, result);
    }

    @Test
    public void printCopies(){
        boolean result = printer.printCopies(30, 30);
        assertEquals(true, result);
    }
}
