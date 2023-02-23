package tech.devinhouse.heranca;

// Exemplo com encapsulamento com getter e setter
public class Gato {

    private String nome;
    private String corDoPelo;
    private Integer idade;

    public Gato() { }

    public Gato(String nome, String corDoPelo, Integer idade) {
        this.nome = nome;
        this.corDoPelo = corDoPelo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
