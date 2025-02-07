package Main.entities;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String conta, int id, double saldo) {
        super(conta, id, saldo);
    }

    @Override
    public void saque(double quantia) {
        double saldoAtual = getSaldo();

        if (saldoAtual >= quantia) {
            System.out.println("Sacando R$ " + quantia);
            atualizarSaldo(-quantia);

        } else {
            System.out.println("ERRO: Valor de saque acima do limite permitido.");
        }
    }
}
