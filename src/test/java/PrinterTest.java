import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 1000);
    }

    @Test
    public void getPaperStock(){
        int result = printer.getPaperStock();
        assertEquals(500, result);
    }


    @Test
    public void enoughPrint(){
        printer.print(10,5);
        int paperStock = printer.getPaperStock();
        int tonerVolume = printer.getTonerVolume();
        assertEquals(450,paperStock);
        assertEquals(950, tonerVolume);
    }

    @Test
    public void refillPaper(){
        int paperStock = printer.refillPaper(10);
        int result = printer.getPaperStock();
        assertEquals(510, result);
    }



}
