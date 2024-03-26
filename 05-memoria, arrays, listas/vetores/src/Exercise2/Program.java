package Exercise2;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i]= sc.nextDouble();
        }
        double soma = 0;
        for (int i=0; i < n; i++){
            soma += vect[i];
        }
        double media = soma/n;
        System.out.printf("VALORES = ");
        for (int i=0; i<n; i++){
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("\nMEDIA = %.2f", media);
        sc.close();
    }
}
