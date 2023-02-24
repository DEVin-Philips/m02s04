package tech.devinhouse.exercicios.exercicio6;

public class Exercicio6 {

    public void validar(String valorCampo, Integer valorMaximoCampo) throws TamanhoInvalidoException {
        if (valorCampo == null || valorMaximoCampo == null
                || valorMaximoCampo < 0) {
            throw new IllegalArgumentException(); // unchecked - nao checkada
        }
        if (valorCampo.length() > valorMaximoCampo) {
            throw new TamanhoInvalidoException(); // checked - checkada
        }
    }

    public static void main(String[] args) {
        Exercicio6 exercicio = new Exercicio6();
        try {
            exercicio.validar("tiago", 10);
            System.out.println("Funcionou");
        } catch (TamanhoInvalidoException | IllegalArgumentException e) {
            System.out.println("Deu problema!");
        }
    }


}
