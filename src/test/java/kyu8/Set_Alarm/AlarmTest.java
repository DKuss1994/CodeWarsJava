package kyu8.Set_Alarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void setAlarmTest() {
       Assertions.assertTrue(Alarm.setAlarm(true,false));
       Assertions.assertFalse(Alarm.setAlarm(false,true));
       Assertions.assertFalse(Alarm.setAlarm(false,false));
       Assertions.assertFalse(Alarm.setAlarm(true,true));
    }
}
