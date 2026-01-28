package kyu7.SumOfTheFirstNthTermOfSeries;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class NthSeries {
    public static String seriesSum(int n) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);
        double value = 1;
        int x = 4;
        if (n == 0) {
            return "0.00";
        }
        if (n == 1) {
            return "1.00";
        }
        for (int i = 1; i < n; i++) {
            value += (double) 1 / x;
            x += 3;
        }
        return df.format(value);
    }
}
