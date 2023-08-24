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

        /* Quando você usa o nextLine() e da uma quebra de linha, essa quebra fica pendente na entrada padrão
         * então você perderá nesse caso o s1, retornando vazio, se fizer um nextLine() vazio resolve, pois
         * você limpa o buffer */
        int d = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(d);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}