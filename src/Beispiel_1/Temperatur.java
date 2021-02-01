package Beispiel_1;

public class Temperatur {
    private double fahrenheit;
    private  double celsius;

    public static void main(String[] args) {

        System.out.println("0.15 Grad Celsius = "+""+celsiustofahrenheit(0.15)+" Grad Fahrenheit");

    }

    public static double celsiustofahrenheit(double celsius) {

        return  celsius*9.0/5.0+32;

    }
}
