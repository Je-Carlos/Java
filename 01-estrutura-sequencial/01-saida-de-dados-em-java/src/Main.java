import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Numero inteiro
        int y = 32;

        // ponto flutuante
        double x = 10.242134;

        String nome = "Jean";
        int idade = 21;
        double renda = 2100.00;


        System.out.println(y);

        // Para formatar o número para quantidade de casas desejadas
        // printf("%.númerof%n", objeto);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        System.out.println("Hello World!");

        // Add ponto ao invés de vírgula
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n",x);

        // Concatenar elementos
        System.out.println("Resultado: "+ y + " metros");
        System.out.printf("Resultado - %.2f metros%n", x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        // Exercício
        System.out.printf("%nExercício%n");
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, which price is $ %.2f%n%s, which price is $ %.2f%n%n" +
                        "Record: %d years old, code %d and gender: %c%n%n" +
                        "Measure with eight decimal places: %.8f%n" +
                        "Rounded (three decimal places): %.3f%n" +
                        "US decimal point: %.3f", product1, price1,
                product2, price2, age, code, gender, measure,measure,measure);


  }
}