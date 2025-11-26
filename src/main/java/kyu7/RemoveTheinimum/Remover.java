package kyu7.RemoveTheinimum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remover {
    public static int[] removeSmallest(int[] numbers) {
        if(numbers == null){
            return numbers;
        } else if (numbers.length == 0) {
            return numbers;
        }

        int count = 0;
        int x = 0;
        int min = numbers[0];
        int[] newNumbers;
        newNumbers = new int[numbers.length-1];
        for(int number:numbers){
            if(number<min){
                min = number;
            }
        }
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]== min && count == 0){
                count ++;
            }
            else{
                newNumbers[x]=numbers [i];
                x++;
            }
        }

        return newNumbers;
    }
}
