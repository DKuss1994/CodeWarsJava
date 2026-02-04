package kyu8.HelpAlex;

public class HelpAlex {
    public static String hoopCount(int n) {
        int value = 10;
        if (n >= value) {
            return "Great, now move on to tricks";

        }
        return "Keep at it until you get it";
    }

    public static String hoopCountLambda(int n) {
        return n < 10 ? "Keep at it until you get it" : "Great, now move on to tricks";
    }
}