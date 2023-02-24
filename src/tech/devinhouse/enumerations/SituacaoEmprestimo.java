package tech.devinhouse.enumerations;

public enum SituacaoEmprestimo {

    ATIVO(0),
    SUSPENSO(1),
    ENCERRADO(2),
    BLOQUEADO(3);

    private Integer codigo;

    private SituacaoEmprestimo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
