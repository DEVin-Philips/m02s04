package tech.devinhouse.exceptions;

public class TestandoCustomException {

    public static void main(String[] args) {
        try {
            procurarNome("tiago");
        } catch (RegistroNaoEncontradoException e) {
            System.out.println("O nome que vc procurou nao foi encontrado");
        }
    }

    private static String procurarNome(String nome) {
        boolean encontrou = true;
        if (!encontrou)
            throw new RegistroNaoEncontradoException();
        return "tiago";
    }

}
