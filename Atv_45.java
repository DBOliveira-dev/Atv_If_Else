package JavaTarde;

import java.util.Random;
import java.util.Scanner;

public class Atv_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 10: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número.");
        } else {
            System.out.println("Você errou. O número sorteado era " + numeroSorteado);
            sc.close();

        }
    }
}


