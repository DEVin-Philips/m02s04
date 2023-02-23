package tech.devinhouse.exceptions;

import java.sql.SQLException;

public class OutroTesteException {

    public static void main(String[] args) {

        // chamada de metodo que nao lanca excecoes ou lanca excecao do tipo unchecked
        String nome1 = obterNome();

        // chamada de metodo que lanca excecao do tipo checked
        try {
            String nome2 = obterOutroNome();
            // acessei arquivos no sistema de arquivos
            // conectei no banco de dados
            // enviei e-mail
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // logica de fechamento de recursos abertos
            System.out.println("Será executado em cao de sucesso ou em caso de erros/excecoes");
        }

    }


    public static String obterNome() {
        System.out.println("Nome resolvido!");
        boolean erro = true;
        if (erro)
            throw new IllegalArgumentException(); // unchecked - nao checkado
        return "tiago";
    }

    public static String obterOutroNome() throws SQLException {
        System.out.println("Outro Nome resolvido acessando banco de dados!");
        boolean erro = true;
        if (erro)
            throw new SQLException(); // checked - checkado
        return "tiago";
    }

}
