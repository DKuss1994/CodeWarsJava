package kyu6.FindTheUniqueNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Kata {
    public static double findUniq(double arr[]) {
        Map<Double,Integer> counts = new HashMap<>();
        for (double v : arr) {
            counts.put(v,counts.getOrDefault(v,0)+1);
        }
        for(Map.Entry<Double,Integer> entry:counts.entrySet()){
            if(entry.getValue()== 1){
                return entry.getKey();
            }
        }
return 0.0;
    }
}
