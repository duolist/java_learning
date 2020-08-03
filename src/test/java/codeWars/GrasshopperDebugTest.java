package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class GrassHopperDebugTest {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", GrasshopperDebug.weatherInfo(50));
    }
    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", GrasshopperDebug.weatherInfo(23));
    }
}