package org.JavaTarde;

import java.util.Scanner;

public class Atv_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        if (nome.startsWith("A") || nome.startsWith("a")) {
            System.out.println("O nome começa com a letra 'A'");
        } else {
            System.out.println("O nome não começa com a letra 'A'");
        }

        sc.close();
    }
}
