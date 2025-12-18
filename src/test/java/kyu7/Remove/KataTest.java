package kyu7.Remove;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {

    @Test
    void urlRemoveTest(){
        String url = "www.hallo.de#test";
        String changeURL = "www.hallo.de";
        Assertions.assertEquals(changeURL,Kata.removeUrlAnchor(url));
    } @Test
    void urlTest(){
        String url = "www.hallo.de.test";
        String changeURL = "www.hallo.de.test";
        Assertions.assertEquals(changeURL,Kata.removeUrlAnchor(url));
    }@Test
    void urlRemoveSplitTest(){
        String url = "www.hallo.de#test";
        String changeURL = "www.hallo.de";
        Assertions.assertEquals(changeURL,Kata.removeUrlSplit(url));
    } @Test
    void urlSplitTest(){
        String url = "www.hallo.de.test";
        String changeURL = "www.hallo.de.test";
        Assertions.assertEquals(changeURL,Kata.removeUrlSplit(url));
    }
}
