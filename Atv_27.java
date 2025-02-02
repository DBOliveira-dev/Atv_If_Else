package JavaTarde;

import java.util.Scanner;

public class Atv_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar a classificação: ");
        int numero = sc.nextInt();
        if (numero >= 1 && numero <= 10) {
            System.out.println("Classificação: A");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("Classificação: B");
        } else if (numero >= 21 && numero <= 30) {
            System.out.println("Classificação: C");
        } else {
            System.out.println("Número fora das faixas A, B ou C");
        }

    }
}
