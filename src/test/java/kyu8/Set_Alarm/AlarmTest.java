package kyu8.Set_Alarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlarmTest {

    @Test
    public void setAlarmTest() {
        Assertions.assertTrue(Alarm.setAlarm(true, false), "Should be true.");
        Assertions.assertFalse(Alarm.setAlarm(true, true), "Should be false.");
        Assertions.assertFalse(Alarm.setAlarm(false, false), "Should be false.");
        Assertions.assertFalse(Alarm.setAlarm(false, true), "Should be false.");
    }
}
