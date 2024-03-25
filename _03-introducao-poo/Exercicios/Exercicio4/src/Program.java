import util.Converter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarQuantity = sc.nextDouble();
        double converted = Converter.dollarConverter(dollarQuantity, dollar);
        System.out.printf("Amount to be paid in reais = %.2f%n", converted);
        sc.close();

    }
}