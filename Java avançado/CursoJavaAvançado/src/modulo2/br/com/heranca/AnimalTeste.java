package modulo2.br.com.heranca;

public class AnimalTeste {
    public static void main(String[] args) {
        cachorro belinha = new cachorro();
        belinha.comida = "ração";
        System.out.println("A belinha come: "+ belinha.comida);
        belinha.dormir();

        galinha joana = new galinha();
        joana.comida = "milho";
        System.out.println("A joana come: "+ joana.comida);
        joana.dormir();
    }    
}