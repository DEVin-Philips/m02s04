package tech.devinhouse.interfaces;

public class FuncionarioHomeOffice implements Trabalhador {

    @Override
    public void baterPonto() {
        System.out.println("Bateu ponto via sistema");
    }

    @Override
    public void registrarNome() {  // sobrescrita de metodo 'default' eh opcional
        System.out.println("Registrou nome como funcionario home office");
    }

}
