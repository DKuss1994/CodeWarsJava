package kyu6.Two_Sum;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] value = new int[2];
        int getTheNumber;
        for (int i = 1; i < numbers.length; i++) {
            for (int i1 = 0; i1 < numbers.length - 1; i1++) {
                getTheNumber = numbers[i] + numbers[i1];
                if (i == i1) {
                    continue;
                }
                if (getTheNumber == target) {
                    value[0] = i1;
                    value[1] = i;
                    return value;
                } else {
                    getTheNumber = 0;
                }
            }
        }
        return null;
    }
}