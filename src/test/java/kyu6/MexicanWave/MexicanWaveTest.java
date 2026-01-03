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
        Assertions.assertArrayEquals(text,MexicanWave.wave(" s p a c e s "));
    }
    @Test
    void testCase3(){
        String[]text = {"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"};
        Assertions.assertArrayEquals(text,MexicanWave.wave("two words"));
    }
    @Test
    void testCaseSubstring1(){
        String[]text = {"Hello", "hEllo", "heLlo", "helLo", "hellO"};
        Assertions.assertArrayEquals(text,MexicanWave.waveSubstring("hello"));
    }
    @Test
    void testCaseSubstring2(){
        String[]text = {" S p a c e s ", " s P a c e s ", " s p A c e s ", " s p a C e s ", " s p a c E s ", " s p a c e S "};
        Assertions.assertArrayEquals(text,MexicanWave.waveSubstring(" s p a c e s "));
    }
    @Test
    void testCaseSubstring3(){
        String[]text = {"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"};
        Assertions.assertArrayEquals(text,MexicanWave.wave("two words"));
    }

}
