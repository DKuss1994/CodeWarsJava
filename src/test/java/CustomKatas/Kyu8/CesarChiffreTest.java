package CustomKatas.Kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CesarChiffreTest {
    @Test
    void test1(){
        Assertions.assertEquals("Hello",CesarChiffre.decryption("Ifmmp",1));

    }
}
