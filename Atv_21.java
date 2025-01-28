package org.JavaTarde;

import java.util.Scanner;

public class Atv_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 + num2 > 100) {
            System.out.println("A soma é maior que 100.");
        } else {
            System.out.println("A soma não é maior que 100.");
        }

        sc.close();
    }
}
