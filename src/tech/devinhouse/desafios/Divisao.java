package tech.devinhouse.desafios;

public class Divisao implements Operacao {
    @Override
    public double calcular(double v1, double v2) {
        return v1 / v2;
    }

    @Override
    public String getDescricao() {
        return "Divisão";
    }
}
