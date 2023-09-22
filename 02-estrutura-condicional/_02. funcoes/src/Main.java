import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);
    }

    public static int max(int valor1, int valor2, int valor3) {
        int aux;
        if (valor1 > valor2 && valor1 > valor3) {
            aux = valor1;
        } else if (valor2 > valor3) {
            aux = valor2;
        } else {
            aux = valor3;
        }
        return aux;
    }

    public static void showResult(int valor) {
        System.out.println("Higher = " + valor);
    }
}