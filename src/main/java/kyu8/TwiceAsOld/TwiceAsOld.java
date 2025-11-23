package kyu8.TwiceAsOld;

public class TwiceAsOld {
//30 sohn ist 0
    public static int twiceAsOld(int dadYears, int sonYears) {
        int count = 1;
        if(dadYears/2 == sonYears){
            return 0;
        }
        while(dadYears/2 != sonYears){
            dadYears++;
            sonYears++;
            count++;



        }

        return count;
    }

}