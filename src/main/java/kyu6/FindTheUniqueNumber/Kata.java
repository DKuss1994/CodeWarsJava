package kyu6.FindTheUniqueNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static double findUniq(double arr[]) {
        double value = 0;
        //boxed wandelt primeteive Daten Typen in ein Objekt hier Double
        ArrayList<Double> doubleArrayList = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        int count;
        for (double v : doubleArrayList) {
            count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (v == arr[i]) {
                    count++;
                }
                if (count == 1) {
                    value = doubleArrayList.get(i);
                }
            }
        }
        return value;

    }
}
