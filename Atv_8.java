package Ativs_If_Else;

import java.util.Scanner;

public class Atv_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Receba uma caractere e verifique se é uma vogal:");

        char caractere = sc.next().charAt(0);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println(caractere + " é uma vogal.");
        } else {
            System.out.println(caractere + " não é uma vogal.");
        }

        sc.close();
    }
}