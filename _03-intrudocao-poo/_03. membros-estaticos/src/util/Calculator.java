package util;

public class Calculator {
/* Nesse caso os métodos não possuem static, sendo assim é necessário criar um objeto
* para instanciar eles dentro de um método static, por isso foi criado um "calc" na main */
    public final double PI = 3.14;

    public double circumference(double radius){
        return 2 * PI * radius;
    }
    public double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3;
    }
}
