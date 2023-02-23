package tech.devinhouse.interfaces;

public interface IBancoDeDados {

    void incluir(String dados);

    void excluir(String dados);

    void alterar(String dados);

    String consultar(String id);

}
