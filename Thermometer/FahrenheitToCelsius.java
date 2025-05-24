package BasicJava.Thermometer;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        double fahrenheit = 100.0; // Example Fahrenheit temperature
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
