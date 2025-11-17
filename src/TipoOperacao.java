public enum TipoOperacao {
    DEPOSITO("Depósito"),
    SAQUE("Saque");

    private String descricao;

    TipoOperacao(String desc) {
        this.descricao = desc;
    }

    public String getDescricao() {
        return descricao;
    }
}
