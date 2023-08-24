public class Main {
    public static void main(String[] args) {
        int x,y;
        double z;
        x = 5;
        y = 2 * x;
        z = 2 * x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        // Boa prática: Sempre indique o tipo do número, se a expressão for double (2.0) e para float (5f)
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        int c, d;
        double resultado;
        c = 5;
        d = 2;
        /* Sem casting resultado = 2.0
        * Com casting resultado = 2.5 */
        resultado = (double) c / d;
        System.out.println(resultado);

        /* Sem casting f = error
         * Com casting f = 5 */
        double a = 5.0;
        int f = (int) a;
        System.out.println(f);


    }
}