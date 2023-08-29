import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 1
        /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        System.out.println("Soma: " + (valor1 + valor2));

//        Exercício 2
        /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π. Raio2
Considere o valor de π = 3,14159 */

        double raio = sc.nextInt();
        double formula = 3.14159 * Math.pow(raio, 2.0);
        System.out.printf("A=%.4f%n", formula);


//        Exercício 3
        /* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
        int a, b , c , d, diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = a * b - c * d;
        System.out.println("Diferença = " + diferenca);

     int funcionario, horas;
     double recebe,calculoDoSalario;
        funcionario = sc.nextInt();
        horas = sc.nextInt();
        recebe = sc.nextDouble();
        calculoDoSalario = (horas * recebe);

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = %.2f%n", calculoDoSalario);

        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago */

        int quantidadeDaPeca1, quantidadeDaPeca2, codigoDaPeca1, codigoDaPeca2;
        double valorDaPeca1, valorDaPeca2, totalPagar;

        codigoDaPeca1 = sc.nextInt();
        quantidadeDaPeca1 = sc.nextInt();
        valorDaPeca1 = sc.nextDouble();

        codigoDaPeca2 = sc.nextInt();
        quantidadeDaPeca2 = sc.nextInt();
        valorDaPeca2 = sc.nextDouble();

        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", ((valorDaPeca1 * quantidadeDaPeca1) + (valorDaPeca2 * quantidadeDaPeca2)));


        sc.close();
    }
}

