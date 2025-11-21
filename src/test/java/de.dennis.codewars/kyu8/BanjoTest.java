package de.dennis.codewars.kyu8;

import kyu8.Banjo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BanjoTest {
    @Test

    public void BanjoExampleTestFalse() {
        String name = "Mark";
        Assertions.assertEquals(name + " does not play banjo", Banjo.areYouPlayingBanjo(name));
        }
    @Test

    public void BanjoExampleTestTrue() {
        String name = "Rieke";
        Assertions.assertEquals(name + " plays banjo" , Banjo.areYouPlayingBanjo(name));
        }
    @Test

    public void BanjoExampleTestFalselower() {
        String name = "mark";
        Assertions.assertEquals(name + " does not play banjo", Banjo.areYouPlayingBanjo(name));
        }
    @Test

    public void BanjoExampleTestTruelower() {
        String name = "rieke";
        Assertions.assertEquals(name + " plays banjo" , Banjo.areYouPlayingBanjo(name));
        }
    }


