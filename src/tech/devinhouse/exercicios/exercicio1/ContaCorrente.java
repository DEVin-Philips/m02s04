package tech.devinhouse.exercicios.exercicio1;

public class ContaCorrente extends Conta implements Operavel {

    @Override
    protected double obterSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}
