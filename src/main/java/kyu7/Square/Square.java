package kyu7.Square;


public class Square {
    public static boolean isSquare(int n) {
        double value;
        value = Math.sqrt(n);
        if (value == Math.floor(value)){
            return true;
        }
        else {
            return false;

        }

    }
}