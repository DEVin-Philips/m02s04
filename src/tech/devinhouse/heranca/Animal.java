package tech.devinhouse.heranca;

public abstract class Animal {

    private String nome;

    protected String atributoProtegido;


    public abstract String emitirSom();

    public void andar() {
        System.out.println("Animal andando");
    }

    protected void metodoProtegido() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
