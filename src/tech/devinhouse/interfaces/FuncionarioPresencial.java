package tech.devinhouse.interfaces;

public class FuncionarioPresencial implements Trabalhador {

    @Override
    public void baterPonto() {
        System.out.println("Bateu ponto via biometria");
    }

}
