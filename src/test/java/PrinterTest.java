import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 40, 10, 100);
    }

    @Test
    public void getSheets() {
        assertEquals(100, printer.getSheets());

    }

    @Test
    public void getPages() {
        assertEquals(40, printer.getPages());
    }

    @Test
    public void getCopies() {
        assertEquals(10, printer.getCopies());
    }

    @Test
    public void getToner(){
        assertEquals(100, printer.getToner());
    }
    @Test
    public void getRefil(){
        assertEquals(100, printer.refill());

    }



}