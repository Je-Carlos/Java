import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        int hora;

        System.out.println("Quantas Horas?");
        hora = sc.nextInt();
        
        if (hora < 12 && hora > 4) System.out.println("Bom dia");
        else if (hora > 12 && hora < 19) System.out.println("Boa tarde");
        else System.out.println("Boa noite");

        sc.close();
    }
}