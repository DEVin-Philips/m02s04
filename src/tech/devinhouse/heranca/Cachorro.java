package tech.devinhouse.heranca;

import tech.devinhouse.interfaces.IBancoDeDados;
import tech.devinhouse.interfaces.Trabalhador;

import java.io.Serializable;

public class Cachorro extends Animal {

    String corDoPelo;

    @Override
    public String emitirSom() {
        return "Au Au Au";
    }

}
