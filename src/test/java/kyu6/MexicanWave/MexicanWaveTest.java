package kyu6.MexicanWave;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MexicanWaveTest {

    @Test
    void testCase1(){
        String[]text = {"Hello", "hEllo", "heLlo", "helLo", "hellO"};
        Assertions.assertArrayEquals(text,MexicanWave.wave("hello"));
    }
    @Test
    void testCase2(){
        String[]text = {" S p a c e s ", " s P a c e s ", " s p A c e s ", " s p a C e s ", " s p a c E s ", " s p a c e S "};
        Assertions.assertArrayEquals(text,MexicanWave.wave("s p a c e s"));
    }

}
