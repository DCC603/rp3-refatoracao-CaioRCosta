import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;
    private Agencia agencia;

    private double saldo;
    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, double saldoInicial) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.operacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        Operacao op = new Operacao(TipoOperacao.DEPOSITO, valor);
        operacoes.add(op);
        saldo += valor;
    }

    public void sacar(double valor) {
        Operacao op = new Operacao(TipoOperacao.SAQUE, valor);
        operacoes.add(op);
        saldo -= valor;
    }

    public String gerarExtrato() {
        StringBuilder sb = new StringBuilder();
        for (Operacao op : operacoes) {
            sb.append(op).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "-----CLIENTE-----\n" +
                cliente +
                "\n\n-----CONTA-----\n" +
                agencia +
                String.format("\nSaldo: %.2f\n\n", saldo) +
                "-----EXTRATO-----\n" +
                gerarExtrato();
    }
}
