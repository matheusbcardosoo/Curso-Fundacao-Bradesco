/**
 * Operadores matemáticos, de incremento e lógicos.
 * @author Matheus Barbosa Cardoso
 */
public class operadores {
    public static void main(String[] args) {
        //Matemáticos
        double x = 2 + 2;
        System.out.println("2 + 2 = " + x);
        double y = 2 * 2;
        System.out.println("2 * 2 = " + y);
        double z = 2 - 1;
        System.out.println("2 - 1 = " + z);
        double a = 10 % 2;
        System.out.println("10 % 2 = " + a);

        //Incremento
        int num1 = 18, num2;
        System.out.println("O numero é = " + num1);
        num2 = ++num1;
        System.out.println("O numero + 1 = " + num2);

        //Lógicos
        boolean b = true;
        boolean c = false;
        boolean d = true;

        System.out.println(b && c);
        System.out.println(d || c);
        System.out.println(!b);
    }
}
