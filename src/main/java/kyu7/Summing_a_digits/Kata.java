package kyu7.Summing_a_digits;

public class Kata{
    public static int sumDigits(int number){
        String x = Integer.toString(number);
        char[] charArray = x.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]== '-'){
                continue;
            }
            sum+=Integer.parseInt( String.valueOf(charArray[i]));
        }

        return sum;
    }
}
