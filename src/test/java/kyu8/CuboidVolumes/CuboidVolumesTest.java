package kyu8.CuboidVolumes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CuboidVolumesTest {
    @Test
    void TestCase(){
        int[] one = {2,2,2};//8
        int []two = {2,2,2};
        Assertions.assertEquals(0,CuboidVolumes.findDifference(one,two));
    }
    @Test
    void TestCase2(){
        int[] one = {3,2,2};//12
        int []two = {2,2,2};//8
        Assertions.assertEquals(4,CuboidVolumes.findDifference(one,two));
    }
    @Test
    void TestCase3(){
        int[] two = {3,2,2};//12
        int []one = {2,2,2};//8
        Assertions.assertEquals(4,CuboidVolumes.findDifference(one,two));
    }
}
