package tech.devinhouse.enumerations;

public class CalculadoraComEnum {

    public static void main(String[] args) {

        Operacao operacao = null;

        int valor = 1;
        if (valor == 1) {
            operacao = Operacao.ADICAO;
        } else if (valor == 2) {
            operacao = Operacao.SUBTRACAO;
        }
        // ...

        Role papelDoUsuario = Role.ADMIN;

        System.out.println(papelDoUsuario.getDescricao());

    }

}
