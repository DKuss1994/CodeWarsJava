package kyu8.VolumeOfACuboid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void testCase1(){
        Assertions.assertEquals(4,Kata.getVolumeOfCuboid(1,2,2));
    }

}