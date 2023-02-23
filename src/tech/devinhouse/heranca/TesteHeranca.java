package tech.devinhouse.heranca;

import java.util.*;

public class TesteHeranca {

    public static void main(String[] args) {

        Zebra zebra = new Zebra();
        Cachorro cachorro = new Cachorro();

//        String nome = zebra.nome;

//        System.out.println( zebra.emitirSom() );

        zebra.emitirSom();

        zebra.setNome("Zebrinha");

        zebra.metodoProtegido();
        String testeAtributoProtegido = cachorro.atributoProtegido;

        zebra.andar();     // Zebra andando
        cachorro.andar();  // Animal andando


        // testes encapsulamento
        Gato gato = new Gato();
//        gato.idade = 95;
        gato.setIdade(95);


        // testes polimorfimo

        Zebra outraZebra = new Zebra();

        // Polimorfimo
        Animal maisUmaZebra = new Zebra();
        Animal maisUmCachorro = new Cachorro();

        Animal animal;

        // qual animal vc quer ver
        // zebra
        animal = new Zebra();

        animal.emitirSom();  // polimorfismo

        System.out.println( maisUmaZebra.emitirSom() );
//        maisUmaZebra.zebrar(); // nao compila
        System.out.println( maisUmCachorro.emitirSom() );

        List<String> nomes = new ArrayList<>();
        Map<String, String> mapa = new LinkedHashMap<>();

    }

}
