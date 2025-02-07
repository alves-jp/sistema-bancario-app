package Main.entities;

import java.util.ArrayList;
import java.util.List;

public class ServicoBancario {

    private List<ContaBancaria> contas;
    private InputUtilitario input;


    public ServicoBancario() {
        this.contas = new ArrayList<>();
        this.input = new InputUtilitario();
    }


    private ContaBancaria buscarConta() {
        System.out.print("Digite o ID da conta: ");
        int idConta = input.readInt();

        for (ContaBancaria conta : contas) {
            if (conta.getId() == idConta) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public void criarConta() {
        System.out.print("Digite o nome do usuário: ");
        String nome = input.readString();

        System.out.print("Digite o ID da conta: ");
        int id = input.readInt();

        System.out.print("Gostaria de realizar algum depósito inicial (S/N)? ");
        String resposta = input.readString().trim().toUpperCase();

        double deposito = 0.0;

        if (resposta.equals("S")) {
            System.out.print("Digite a quantia que deseja depositar: ");
            deposito = input.readDouble();
        }

        System.out.print("Qual conta você gostaria de criar (Poupança/Corrente)? ");
        String tipoConta = input.readString().trim().toLowerCase();

        if (tipoConta.equals("poupança")) {
            contas.add(new ContaPoupanca(nome, id, deposito));

        } else if (tipoConta.equals("corrente")) {
            contas.add(new ContaCorrente(nome, id, deposito, 1000));

        } else {
            System.out.println("ERRO: TIPO DE CONTA INVÁLIDO.");
            System.out.println();
        }

        if (contas != null) {
            System.out.println("Conta ID " + id + " criada com sucesso!");
            System.out.println();
        }
    }

    public void efetuarSaque() {
        ContaBancaria conta = buscarConta();

        if (conta != null) {
            System.out.print("Digite a quantia que deseja sacar: ");
            double quantiaSaque = input.readDouble();
            conta.saque(quantiaSaque);
            System.out.println();

        } else {
            System.out.println("ERRO: Conta não encontrada.");
        }
    }

    public void efetuarDeposito() {
        ContaBancaria conta = buscarConta();

        if (conta != null) {
            System.out.print("Digite a quantia que deseja depositar: ");
            double quantiaDeposito = input.readDouble();
            conta.deposito(quantiaDeposito);
            System.out.println();

        } else {
            System.out.println("ERRO: Conta não encontrada.");
        }
    }

    public void verificarSaldo() {
        ContaBancaria conta = buscarConta();

        if (conta != null) {
            System.out.println("Saldo atual: R$ " + String.format("%.2f", conta.getSaldo()));
            System.out.println();

        } else {
            System.out.println("ERRO: Conta não encontrada.");
        }
    }
}
