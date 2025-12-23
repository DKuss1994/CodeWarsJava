package kyu6.Equal_Sides;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        int index = -1;

        while (true){
            index++;
            int sumLeft = 0;
            int sumRight = 0;


        for (int i = index; i < arr.length; i++) {
            sumRight+= arr[i];


        }
        for (int i = index; i >= 0; i--) {
            sumLeft += arr[i];
        }
        if (sumLeft==sumRight){
        return index;
        } else if (index == arr.length-1) {
            return -1;

        }


        }
    }
}