package kyu7.Printer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.Printer.Printer.printerError;

public class PrinterTest {
    @Test
    public void TestCase1(){
        String druckerAusgabe = "abcdefgh";
        Assertions.assertEquals(printerError(druckerAusgabe),"0/8");
    }
}
