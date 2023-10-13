import util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
//    final utilizado quando o valor é constante
//    quando o valor é constante, o nome da classe é toda maíuscula (ex: NET_SALARY)
//    public static final double PI = 3.14;

//    Quando um método é estático, todos os outros devem ser, nesse caso a main não aceita
//    métodos sem serem estáticos
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }

//    public static double circumference(double radius){
//        return 2 * PI * radius;
//    }
//    public static double volume(double radius){
//        return 4.0 * PI * radius * radius * radius / 3;
//    }
}