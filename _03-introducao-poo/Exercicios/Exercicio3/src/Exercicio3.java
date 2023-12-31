import enteties.Grades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Grades grade = new Grades();

        grade.name = sc.nextLine();
        grade.grade1 = sc.nextDouble();
        grade.grade2 = sc.nextDouble();
        grade.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", grade.finalGrade());

        if(grade.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", grade.missing());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
