public class ContaCorrente extends ContaBancaria{

    private double chequeEspecial;

    public ContaCorrente(String conta, int id, double saldo, double chequeEspecial) {
        super(conta, id, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void saque(double quantia) {
        double saldoAtual = getSaldo();

        if (saldoAtual + chequeEspecial >= quantia) {
            System.out.println("Sacando R$ " + quantia);
            atualizarSaldo(-quantia);

        } else  {
            System.out.println("Saldo insuficiente para saque.");
            System.out.println();
        }
    }
}
