package tech.devinhouse.exercicios.exercicio3;

public class Produto implements Tributavel {

    private Double valor;
    private Double valorImposto;

    @Override
    public Double calcularValorComImposto() {
        return valor + valorImposto;
    }

}
