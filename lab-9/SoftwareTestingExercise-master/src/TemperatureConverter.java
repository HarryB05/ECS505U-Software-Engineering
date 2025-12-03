public class TemperatureConverter {
    public static double CELSIUS_MIN = -273.15;
    public static double CELSIUS_MAX = 5500000000000.0;
    public static double FAHRENHEIT_MIN =  -459.67;
    public static double FAHRENHEIT_MAX = 9900000000032.0;
    public static double KELVIN_MIN = 0;
    public static double KELVIN_MAX = 5500000000273.15;

    public static double F2K(double tempF) {
        if (tempF < FAHRENHEIT_MIN || tempF > FAHRENHEIT_MAX) {
            throw new IllegalArgumentException("Temperature in Fahrenheit is out of bounds.");
        } else {
            return (tempF + 459.67) / 1.8;
        }
    }

    public static double F2C(double tempF) {
        if (tempF < FAHRENHEIT_MIN || tempF > FAHRENHEIT_MAX) {
            throw new IllegalArgumentException("Temperature in Fahrenheit is out of bounds.");
        } else {
            return (tempF - 32) / 1.8;
        }
    }

    public  static double C2F(double tempC) {
        if (tempC < CELSIUS_MIN || tempC > CELSIUS_MAX) {
            throw new IllegalArgumentException("Temperature in Celsius is out of bounds.");
        } else {
            return (tempC * 1.8) + 32;
        }
    }

    public  static double C2K(double tempC) {
        if (tempC < CELSIUS_MIN || tempC > CELSIUS_MAX) {
            throw new IllegalArgumentException("Temperature in Celsius is out of bounds.");
        } else {
            return tempC + 273.15;
        }
    }

    public static double K2F(double tempK) {
        if (tempK < KELVIN_MIN || tempK > KELVIN_MAX) {
            throw new IllegalArgumentException("Temperature in Kelvin is out of bounds.");
        } else {
            return (tempK * 1.8) - 459.67;
        }
    }

    public  static double K2C(double tempK) {
        if (tempK < KELVIN_MIN || tempK > KELVIN_MAX) {
            throw new IllegalArgumentException("Temperature in Kelvin is out of bounds.");
        } else {
            return tempK - 273.15;
        }
    }
}
