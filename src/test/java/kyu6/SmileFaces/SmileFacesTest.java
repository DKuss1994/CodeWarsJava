package kyu6.SmileFaces;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
public class SmileFacesTest {
    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }
    @Test
    public void test2() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }
    @Test
    public void testStream1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileysStream(a));
    }
    @Test
    public void testStream2() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileysStream(a));
    }
}
