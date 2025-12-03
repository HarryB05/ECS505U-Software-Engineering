import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

      @Test
      @DisplayName("CELS_MIN")
    public void testCELS_MIN() {
        double expResult = -273.15;
        double result = TemperatureConverter.CELSIUS_MIN;
        assertEquals(expResult, result, 0.0);
    }

    @Test
    @DisplayName("CELS_MAX")
    public void testCELS_MAX() {
        double expResult = 5500000000000d;
        double result = TemperatureConverter.CELSIUS_MAX;
        assertEquals(expResult, result, 0.0);

    }

    @Test
    @DisplayName("FAH_MIN")
    public void testFAH_MIN() {
        double expResult = -459.67;
        double result = TemperatureConverter.FAHRENHEIT_MIN;
        assertEquals(expResult, result, 0.0);
    }

    @Test
    @DisplayName("FAH_MAX")
    public void testFAH_MAX() {
        double expResult = 9900000000032d;
        double result = TemperatureConverter.FAHRENHEIT_MAX;
        assertEquals(expResult, result, 0.0);
    }

    @Test
    @DisplayName("KEL_MIN")
    public void testKEL_MIN() {
        double expResult = 0;
        double result = TemperatureConverter.KELVIN_MIN;
        assertEquals(expResult, result, 0.0);
    }

    @Test
    @DisplayName("KEL_MAX")
    public void testKEL_MAX() {
        double expResult = 5500000000273.15;
        double result = TemperatureConverter.KELVIN_MAX;
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of F2C method, of class TemperatureConverter.
     */
    @Test
    @DisplayName("F2CMin")
    public void testF2CMin() {
        double tempF = 0.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = -17.77778;
        double result = instance.F2C(tempF);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    @DisplayName("F2CMax")
    public void testF2CMax() {
        double tempF = 9900000000032d;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 5500000000000d;
        double result = instance.F2C(tempF);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of F2K method, of class TemperatureConverter.
     */
    @Test
    @DisplayName("F2KMin")
    public void testF2KMin() {
        double tempF = 0.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 255.37222;
        double result = instance.F2K(tempF);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    @DisplayName("F2KMax")
    public void testF2KMax() {
        double tempF = 9900000000032d;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 5500000000273.15;
        double result = instance.F2K(tempF);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of C2F method, of class TemperatureConverter.
     */
    @Test
    @DisplayName("C2FMIn")
    public void testC2FMin() {
        double tempC = -273.15;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = -459.67;
        double result = instance.C2F(tempC);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    @DisplayName("C2FMax")
    public void testC2FMax() {
        double tempC = 5500000000000d;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 9900000000032d;
        double result = instance.C2F(tempC);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of C2K method, of class TemperatureConverter.
     */
    @Test
    @DisplayName("C2KMin")
    public void testC2KMin() {
        double tempC = -273.15;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 0.0;
        double result = instance.C2K(tempC);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    @DisplayName("C2KMax")
    public void testC2KMax() {
        double tempC = 5500000000000d;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 5500000000273.15;
        double result = instance.C2K(tempC);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of K2F method, of class TemperatureConverter.
     */
    @Test
    @DisplayName("K2FMin")
    public void testK2FMin() {
        double tempK = 0.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = -459.67;
        double result = instance.K2F(tempK);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    @DisplayName("K2FMax")
    public void testK2FMax() {
        double tempK = 5500000000273.15;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 9900000000032.0;
        double result = instance.K2F(tempK);
        assertEquals(expResult, Math.rint(result), 0.001);
    }

    /**
     * Test of K2C method, of class TemperatureConverter.
     */
    @Test
    @DisplayName("K2CMin")
    public void testK2CMin() {
        double tempK = 0.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = -273.15;
        double result = instance.K2C(tempK);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    @DisplayName("K2CMax")
    public void testK2CMax() {
        double tempK = 5500000000273.15;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 5500000000000d;
        double result = instance.K2C(tempK);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    @DisplayName("KMaxException")
    public void testKMax() {
        double tempK = 5500000000275.15;
        TemperatureConverter instance = new TemperatureConverter();
        Assertions.assertThrows(IllegalArgumentException.class, ()->instance.K2C(tempK));

    }

    @Test
    @DisplayName("KMinException")
    public void testKMin() {
        double tempK = -0.5;
        TemperatureConverter instance = new TemperatureConverter();
        Assertions.assertThrows(IllegalArgumentException.class, ()->instance.K2C(tempK));
    }

    @Test
    @DisplayName("CMaxException")
    public void testCMax() {
        double tempC = 5500000000000.1;
        TemperatureConverter instance = new TemperatureConverter();
        Assertions.assertThrows(IllegalArgumentException.class, ()->instance.C2K(tempC));

    }

    @Test
    @DisplayName("CMinException")
    public void testCMin() {
        double tempC = -273.151;
        TemperatureConverter instance = new TemperatureConverter();
        Assertions.assertThrows(IllegalArgumentException.class, ()->instance.C2K(tempC));
    }

    @Test
    @DisplayName("CMaxException")
    public void testFMax() {
        double tempF = 9900000000032.151;
        TemperatureConverter instance = new TemperatureConverter();
        Assertions.assertThrows(IllegalArgumentException.class, ()->instance.F2K(tempF));

    }

    @Test
    @DisplayName("CMinException")
    public void testFMin() {
        double tempF = -459.671;
        TemperatureConverter instance = new TemperatureConverter();
        Assertions.assertThrows(IllegalArgumentException.class, ()->instance.F2K(tempF));
    }

}
