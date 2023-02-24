package tech.devinhouse.desafios;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println("== Menu == ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a operacao desejada:");
        int op = scanner.nextInt();
        System.out.println("Informe o valor 1:");
        double valor1 = scanner.nextDouble();
        System.out.println("Informe o valor 2:");
        double valor2 = scanner.nextDouble();

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

        double calculo = operacao.calcular(valor1, valor2);
        System.out.println("Operacao realizada = " + operacao.getDescricao());
        System.out.println("Resultado = " + calculo);
    }

}
