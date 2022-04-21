package modulo2;

public class MatematicaTeste {
    public static void main(String[] args) {
        
        Matematica math = new Matematica();

        int maior = math.maior(20,30);
        System.out.println(maior);

        double soma = math.soma(1500, 214);
        System.out.println(soma);

    }
}