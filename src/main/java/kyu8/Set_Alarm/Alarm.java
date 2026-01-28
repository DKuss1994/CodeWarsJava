package kyu8.Set_Alarm;

public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed && !vacation){
            return true;
        }
       return false;
    }

}
