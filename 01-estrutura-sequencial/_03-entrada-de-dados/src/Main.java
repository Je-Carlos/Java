import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        int y = sc.nextInt();
        double z = sc.nextDouble();
        char a = sc.next().charAt(0);

        System.out.println("Você digitou o valor : " + x);
        System.out.println("Número : " + y);
        System.out.printf("Valor double : %.2f%n" ,z);
        System.out.println("Valor char : " + a);

        sc.close();

    }
}