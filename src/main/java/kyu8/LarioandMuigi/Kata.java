package kyu8.LarioandMuigi;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = numbers[0]; i <= numbers[numbers.length-1]; i++) {
            value.add(i);

        }
        int [] newValue = new int[value.size()];
        for (int i = 0; i < newValue.length; i++) {
            newValue[i] = value.get(i);
        }

        return newValue;
    }

    public static int[] pipeFixStream(int[] input) {
            return IntStream.rangeClosed(input [0],input[input.length-1]).toArray();
    }
}
