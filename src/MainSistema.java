import java.util.Locale;
import java.util.Scanner;

public class MainSistema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ServicoBancario servicoBancario = new ServicoBancario();
        InputUtilitario input = new InputUtilitario();

        boolean sistemaFuncionando = true;

        while (sistemaFuncionando) {
            System.out.println("1. CRIAR NOVA CONTA");
            System.out.println("2. EFETUAR UM DEPÓSITO");
            System.out.println("3. REALIZAR UM SAQUE");
            System.out.println("4. VERIFICAR SALDO");
            System.out.println("5. SAIR");
            System.out.print("Digite sua opção: ");
            int opcao = input.readInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    servicoBancario.criarConta();
                    break;
                    
                case 2:
                    servicoBancario.efetuarDeposito();
                    break;
                    
                case 3:
                    servicoBancario.efetuarSaque();
                    break;
                    
                case 4:
                    servicoBancario.verificarSaldo();
                    break;
                    
                case 5:
                    System.out.println("Saindo...");
                    System.out.println("Programa finalizado com sucesso.");
                    sistemaFuncionando = false;
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}