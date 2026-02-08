package kyu8.DayOfWeek;

public class DayOfWeek {
    public static String getDay(int i) {

        switch (i){
            case 1:return "Sunday";
            case 2:return "Monday";
            case 3:return "Tuesday";
            case 4:return "Wednesday";
            case 5:return "Thursday";
            case 6:return "Friday";
            case 7:return "Saturday";

        }
        return "Wrong, please enter a number between 1 and 7";
    }
}
