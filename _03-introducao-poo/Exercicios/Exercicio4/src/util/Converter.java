package util;

public class Converter {
    public static double IOF = 0.06;
    public static double dollarConverter(double amount, double dollar){
        return (dollar * amount) * (1.0 + IOF);
    }
}
