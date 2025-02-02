package JavaTarde;

import java.util.Scanner;

public class Atv_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }

        sc.close();

    }
}
