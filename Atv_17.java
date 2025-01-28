package org.JavaTarde;

import java.util.Scanner;

public class Atv_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaEsperada = "1234";

        System.out.println("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaEsperada)) {
            System.out.println("Senha correta! ");
        } else {
            System.out.println("Senha incorreta! ");
        }

        sc.close();
    }
}
