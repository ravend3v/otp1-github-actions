package tempconverter;

public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40.0 || celsius > 50.0;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = 80.0;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        celsius = 37.0;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        System.out.println("Is " + celsius + "°C extreme? " + converter.isExtremeTemperature(celsius));
    }
}