package tech.devinhouse.enumerations;

public class TesteEnumSitucao {

    public static void main(String[] args) {
        SituacaoEmprestimo situacao = SituacaoEmprestimo.ATIVO;
        // na hora de gravar no banco de dados o codigo, eu posso pedir
        // pra enum me informar o codigo correspondente
        int codigo = situacao.getCodigo();
    }

}
