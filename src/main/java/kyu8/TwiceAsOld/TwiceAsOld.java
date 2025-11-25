package kyu8.TwiceAsOld;

public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {
        int value;
        value = dadYears - 2*sonYears;
        if (value<0){
            return value * -1;
        }
        else{
            return value;
        }

    }
}