/**
 * Manipulação de ARRAYS
 * @author Matheus Barbosa Cardoso
 */

import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        String [] frutas = {"Maçã", "Pera", "Banana", "Laranja"};
        System.out.println(frutas[0]);
        System.out.println(Arrays.toString(frutas));

        int posicao = Arrays.binarySearch(frutas, "Banana");
        System.out.println(posicao);

        Arrays.sort(frutas, 0, frutas.length);
        System.out.println(Arrays.toString(frutas));
    
        String[] [] pessoa = {{"Matheus", "M", "SP"}, {"Joana", "F", "SP"}};
        System.out.println(pessoa[0][0]);
    }
}
