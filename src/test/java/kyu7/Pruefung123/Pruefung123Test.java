package kyu7.Pruefung123;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Pruefung123Test {
    @Test
    public void basicTestsLeer() {
    Assertions.assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), Pruefung123.LineNumbering(Arrays.asList("", "", "", "", "")));
    }
    @Test
    public void basicTestsBuchstabeN (){
    Assertions.assertEquals(Arrays.asList("1: a", "2: b", "3: c", "4: d", "5: e"),Pruefung123.LineNumbering(Arrays.asList("a", "b", "c", "d", "e")));
    }
    @Test
    public void basicTestsEmpty() {
    Assertions.assertEquals(Arrays.asList(),Pruefung123.LineNumbering(Arrays.asList()));
    }


}


