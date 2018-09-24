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

//    @Test
//    public void printCopies(){
//        boolean result = printer.printCopies(30, 30);
//        assertEquals(true, result);
//    }


    @Test
    public void enoughPrint(){
        int result = printer.print(10,5);
        assertEquals(450, result);
    }

    @Test
    public void refillPaper(){
        int paperStock = printer.refillPaper(10);
        int result = printer.getPaperStock();
        assertEquals(510, result);
    }

    @Test
    public void printReduceTonerVolume(){
        int paperStock = printer.printReduceTonerVolume(10, 10);
        int result = printer.getTonerVolume();
        assertEquals(900, result);
    }

}
