package Main.entities;

import java.util.Scanner;

public class InputUtilitario {
    private Scanner scanner;


    public InputUtilitario() {
        this.scanner = new Scanner(System.in);
    }


    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Comando inválido. Por favor digite um número válido: ");
            scanner.next();
        }

        int value = scanner.nextInt();
        scanner.nextLine();

        return value;
    }

    public double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Comando inválido. Por favor digite um número válido: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}

