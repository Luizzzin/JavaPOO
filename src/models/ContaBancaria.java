package models;

//conceito de encapsulamento!!!!

public class ContaBancaria {

private double saldo = 757.27;

    public void Depositar(double Valor){
        Valor = 10.50;
        if (Valor > 0){
        saldo += Valor;
        }
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
