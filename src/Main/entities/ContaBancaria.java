package Main.entities;

public class ContaBancaria {

    private String conta;
    private int id;
    private double saldo;

    public ContaBancaria(String conta, int id, double saldo) {
        this.conta = conta;
        this.id = id;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }


    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void saque(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado com sucesso.");

        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void deposito(double quantia) {
        saldo += quantia;
        System.out.println("Depósito de R$ " + quantia + " realizado com sucesso.");
    }

    public void atualizarSaldo(double quantia) {
        saldo += quantia;
    }

    @Override
    public String toString() {
        return "Conta Bancaria:" +
                "Proprietário'" + conta + '\'' +
                ", ID: " + id +
                ", Saldo atual: " + saldo;
    }
}
