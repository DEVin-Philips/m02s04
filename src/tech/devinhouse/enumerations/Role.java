package tech.devinhouse.enumerations;

public enum Role {  // papel do usuario no sistema

    USUARIO("Usuario"),
    ADMIN("Administrador"),
    SUPER_ADMIN("super-admn"),
    GESTOR("Gestor");

    private String descricao;

    private Role(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
