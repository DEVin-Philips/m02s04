package tech.devinhouse.interfaces;

public interface Trabalhador {

    void baterPonto();

    default void registrarNome() {
        System.out.println("Nome Registrado");
    }

}
