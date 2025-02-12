package JavaTarde;

import java.util.Scanner;

public class Atv_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = 34; // Número secreto

        System.out.print("Digite um número para adivinhar: ");
        int palpite = sc.nextInt();

        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou o número secreto!");
        } else {
            System.out.println("Errou! Tente novamente.");
            sc.close();

        }
    }
}
