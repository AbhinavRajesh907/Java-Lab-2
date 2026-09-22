// Q19: Static Method Temperature Conversion
import java.util.Scanner;

class TemperatureConverter {
    static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }
}

public class Q19_StaticTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        double f = TemperatureConverter.celsiusToFahrenheit(c);
        System.out.println("Fahrenheit = " + f);
    }
}
