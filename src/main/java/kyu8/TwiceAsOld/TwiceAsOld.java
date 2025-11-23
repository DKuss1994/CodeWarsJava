package kyu8.TwiceAsOld;

public class TwiceAsOld {
//30 sohn ist 0
    public static int twiceAsOld(int dadYears, int sonYears) {
        int count = 1;
        while(dadYears/2 != sonYears){
            dadYears++;
            sonYears++;
            count++;



        }
        return count;
    }

}