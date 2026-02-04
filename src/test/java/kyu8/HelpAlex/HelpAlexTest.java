package kyu8.HelpAlex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HelpAlexTest {
    @Test
    public void testHoopCount(){
        Assertions.assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
        Assertions.assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
    }
    @Test
    public void testHoopCountLambda(){
        Assertions.assertEquals("Great, now move on to tricks", HelpAlex.hoopCountLambda(11));
        Assertions.assertEquals("Keep at it until you get it", HelpAlex.hoopCountLambda(7));
    }

}
