package kyu8.TwiceAsOld;

public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {
        int count = 1;

        while (dadYears / 2 != sonYears) {
            dadYears++;
            sonYears++;
            count++;


        }
        if(count<0){
            count *= -1;
            return count;
        }
        else {
            if(dadYears%2!= 0){
                return count++;
            }
            else if(dadYears/2 == sonYears){
                return count = 0;

            }
            else {
                return count;
            }

        }


    }

}