package modulo2;

public class ContaTeste {
     public static void main(String[] args) {
         
        Conta conta = new Conta();

        conta.cliente="Matheus";
        conta.saldo=7_514.01;
        conta.exibeSaldo();

        conta.sacar(2018);
        conta.exibeSaldo();

        conta.depositar(517);
        conta.exibeSaldo();

        Conta destino = new Conta();
        destino.cliente = "João";
        destino.saldo = 1_438.00;
        destino.exibeSaldo();
     }
}