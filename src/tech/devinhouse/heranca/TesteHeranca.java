package tech.devinhouse.heranca;

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


        Gato gato = new Gato();
//        gato.idade = 95;
        gato.setIdade(95);

    }

}
