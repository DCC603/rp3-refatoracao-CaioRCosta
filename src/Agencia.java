public class Agencia {
    private int numeroAgencia;
    private int numeroConta;
    private String gerente;

    public Agencia(int numeroAgencia, int numeroConta, String gerente) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return String.format("Ag.: %d\nConta: %d\nGerente: %s",
                numeroAgencia, numeroConta, gerente);
    }
}
