package kyu7;

import java.util.ArrayList;
import java.util.List;

public class Pruefung123 {

    public static List<String> LineNumbering(List<String> lines) {
        List<String> result = new ArrayList<>();
        if (!lines.isEmpty()) {
            for (int x = 0; x < lines.size(); x++) {
                result.add((x + 1) + ": " + lines.get(x));

            }
            return result;
        }
        return lines;

    }
}
