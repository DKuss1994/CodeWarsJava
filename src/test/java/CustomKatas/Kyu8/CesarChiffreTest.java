package CustomKatas.Kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CesarChiffreTest {
    @Test
    void test1(){
        Assertions.assertEquals("Hello",CesarChiffre.decryption("Ifmmp",1));

    }
    @Test
    void testBig1(){
        Assertions.assertEquals("HELLO",CesarChiffre.decryption("IFMMP",1));

    }
    @Test
    void test2(){
        Assertions.assertEquals("Z",CesarChiffre.decryption("A",1));

    }
    @Test
    void test3(){
        Assertions.assertEquals("A",CesarChiffre.decryption("A",26));

    }
    @Test
    void test4(){
        Assertions.assertEquals("A",CesarChiffre.decryption("A",52));

    }

    @Test
    void test5(){
        Assertions.assertEquals("H e l l o",CesarChiffre.decryption("I f m m p",1));

    }
    @Test
    void test6(){
        Assertions.assertEquals("BA",CesarChiffre.decryption("C?B",1));

    }
    @Test
    void testLittle1(){
        Assertions.assertEquals("hello",CesarChiffre.decryption("ifmmp",1));

    }
    @Test
    void testLittle2(){
        Assertions.assertEquals("z",CesarChiffre.decryption("a",1));

    }
    @Test
    void testLittle3(){
        Assertions.assertEquals("a",CesarChiffre.decryption("a",26));

    }
    @Test
    void testLittle4(){
        Assertions.assertEquals("a",CesarChiffre.decryption("a",52));

    }
    @Test
    void testLittle5(){
        Assertions.assertEquals("ba",CesarChiffre.decryption("c?b",1));

    }
    @Test
    void testMix1(){
        Assertions.assertEquals("hElLo",CesarChiffre.decryption("iFmMp",1));

    }
    @Test
    void testMix2(){
        Assertions.assertEquals("zZz",CesarChiffre.decryption("aAa",1));

    }
    @Test
    void testMix3(){
        Assertions.assertEquals("aAaA",CesarChiffre.decryption("aAaA",26));

    }
    @Test
    void testMix4(){
        Assertions.assertEquals("aAaA",CesarChiffre.decryption("aAaA",52));

    }
    @Test
    void testMix5(){
        Assertions.assertEquals("BaBa",CesarChiffre.decryption("C?b!C,b",1));

    }
}
