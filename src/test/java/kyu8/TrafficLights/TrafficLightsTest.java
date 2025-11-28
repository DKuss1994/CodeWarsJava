package kyu8.TrafficLights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu8.TrafficLights.TrafficLights.updateLight;

public class TrafficLightsTest {
    @Test
    public void testCaseGreenToYellow(){
        Assertions.assertEquals(updateLight("green"),"yellow");
    }
}
