package org.JavaTarde;

import java.util.Scanner;

public class Atv_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 - num2 < 0) {
            System.out.println("A diferença é negativa.");
        } else {
            System.out.println("A diferença não é negativa.");
        }

        sc.close();
    }
}
