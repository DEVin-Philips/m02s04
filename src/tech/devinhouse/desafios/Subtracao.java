package tech.devinhouse.desafios;

public class Subtracao implements Operacao {
    @Override
    public double calcular(double v1, double v2) {
        return v1 - v2;
    }

    @Override
    public String getDescricao() {
        return "Subtração";
    }
}
