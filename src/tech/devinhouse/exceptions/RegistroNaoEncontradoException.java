package tech.devinhouse.exceptions;

public class RegistroNaoEncontradoException extends RuntimeException {

    private String mensagemPersonalizada;

    public RegistroNaoEncontradoException() { }

    public RegistroNaoEncontradoException(String mensagemGenerica) {
        super(mensagemGenerica); // atribuir valor no atributo message
    }

    public RegistroNaoEncontradoException(String mensagemGenerica, String mensagemPersonalizada) {
        this.mensagemPersonalizada = mensagemPersonalizada;
    }

}
