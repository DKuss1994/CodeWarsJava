package kyu6.FindTheUniqueNumber;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map.Entry;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import static java.util.stream.Collectors.groupingBy;


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
    public static double findUniqLamba(double arr[]){
        Arrays.sort(arr);
        return arr[0] == arr[1]?arr[arr.length-1]:arr[0];
    }
    public static double findUniqStream(double arr[]){
        return Arrays.stream(arr).boxed().collect(groupingBy(identity(),counting())).entrySet()
                .stream().filter(e->e.getValue()==1).findFirst()
                .map(Entry::getKey).orElse(0.0);
    }

}
