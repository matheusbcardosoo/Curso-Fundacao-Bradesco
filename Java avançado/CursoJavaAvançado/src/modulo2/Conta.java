package modulo2;

public class Conta {
    String cliente;
    double saldo;

    void exibeSaldo(){
        System.out.println(cliente + " seu saldo é de: " + saldo);
    }

    void sacar(double valor){
        saldo -=valor;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }
}