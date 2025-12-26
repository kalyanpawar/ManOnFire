package src.basiclevel;
// (°C × 9/5) + 32 = °F
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println(toFahrenheit(24));
    }

    static double toFahrenheit(float celsius){
        System.out.println(celsius * 9/5);
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}
