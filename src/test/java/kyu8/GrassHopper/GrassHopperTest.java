package kyu8.GrassHopper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu8.GrassHopper.GrassHopper.getGrade;

public class GrassHopperTest {
    @Test
    public void testCaseF(){
        Assertions.assertEquals(getGrade(60,50,60),'F');
        Assertions.assertEquals(getGrade(60,50,60),'F');
        Assertions.assertEquals(getGrade(60,50,60),'F');
        Assertions.assertEquals(getGrade(30,30,30),'F');
        Assertions.assertEquals(getGrade(40,70,25),'F');
    }
    @Test
    public void testCaseD(){
        Assertions.assertEquals(getGrade(60,60,60),'D');
        Assertions.assertEquals(getGrade(70,60,59),'D');

    }
}