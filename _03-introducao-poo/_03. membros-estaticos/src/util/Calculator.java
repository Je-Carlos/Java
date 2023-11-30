package util;

public class Calculator {
/* Nesse caso os métodos não possuem static, sendo assim é necessário criar um objeto
* para instanciar eles dentro de um método static, por isso foi criado um "calc" na main */
    public static final double PI = 3.14;

    public static double circumference(double radius){
        return 2 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3;
    }
}
