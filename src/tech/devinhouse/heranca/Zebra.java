package tech.devinhouse.heranca;

public class Zebra extends Animal {

    int qtdListras;

    @Override  // sobrescrita
    public String emitirSom() {
        return "Zuuuuu";
    }

    @Override
    public void andar() {
        System.out.println("Zebra andando");
    }

    public void zebrar() {
        System.out.println("Estou zebrando");
    }

}
