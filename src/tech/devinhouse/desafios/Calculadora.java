package tech.devinhouse.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.exibirMenu();
        try {
            int codigoOperacao = calculadora.obterOperacaoDoUsuario();
            Operacao operacao = calculadora.obterOperacaoApartirDoCodigo(codigoOperacao);
            double valor1 = calculadora.obterValorDoUsuario();
            double valor2 = calculadora.obterValorDoUsuario();
            calculadora.exibirResultados(operacao, valor1, valor2);
        } catch (CalculadoraException e) {
            System.out.println(e.getMessage());
        }
    }

    private void exibirMenu() {
        System.out.println("== Menu == ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
    }

    private int obterOperacaoDoUsuario() throws CalculadoraException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a operacao desejada:");
            int op = scanner.nextInt();
            return op;
        } catch (InputMismatchException e) {
            throw new CalculadoraException("Usuario informou codigo de operacao invalido");
        }
    }

    private double obterValorDoUsuario() throws CalculadoraException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o valor:");
            double valor = scanner.nextDouble();
            return valor;
        }  catch (InputMismatchException e) {
            throw new CalculadoraException("Usuario informou valor de formato invalido");
        }
    }

    private Operacao obterOperacaoApartirDoCodigo(int op) {
        Operacao operacao = null;
        switch (op) {
            case 1:
                operacao = new Adicao();
                break;
            case 2:
                operacao = new Subtracao();
                break;
            case 3:
                operacao = new Multiplicacao();
                break;
            case 4:
                operacao = new Divisao();
                break;
        }
        return operacao;
    }

    private void exibirResultados(Operacao operacao, double valor1, double valor2) {
        double calculo = operacao.calcular(valor1, valor2);
        System.out.println("Operacao realizada = " + operacao.getDescricao());
        System.out.println("Resultado = " + calculo);
    }

}
