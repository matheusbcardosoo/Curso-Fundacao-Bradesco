/*package modulo3.br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;
        do{
            try {                
                System.out.println("Número: ");
                int num1 = s.nextInt();
                System.out.println("Divisor: ");
                int num2 = s.nextInt();
                System.out.println(num1/num2);
                continuar = false;
            }

            catch (InputMismatchException e1){
                System.err.println("Insira numeros inteiros!");
                s.nextLine(); //serve para descartar entradas inválidas.
            }
            catch (Throwable e2){
                System.err.println("O divisor deve ser diferente de zero!");
            }
            finally{
                System.err.println("Finally executado...");
            }
        } while (continuar);
    }
}*/