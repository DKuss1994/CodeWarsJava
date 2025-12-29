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
}
