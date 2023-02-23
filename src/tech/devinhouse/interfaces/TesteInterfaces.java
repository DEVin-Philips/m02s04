package tech.devinhouse.interfaces;

public class TesteInterfaces {

    public static void main(String[] args) {

        FuncionarioPresencial presencial = new FuncionarioPresencial();
        FuncionarioHomeOffice homeOffice = new FuncionarioHomeOffice();

        Trabalhador trabalhador = new FuncionarioHomeOffice();

        presencial.baterPonto();
        homeOffice.baterPonto();

        trabalhador.baterPonto();


//        Saudavel s = () -> false;  // lambda function


    }

}
