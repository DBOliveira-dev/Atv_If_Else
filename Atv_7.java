package Ativs_If_Else;

import java.util.Scanner;

public class Atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é multiplo de 5:");

        int n1 = sc.nextInt();

        if (n1 % 5 == 0) {
            System.out.println("O número é múltiplo de 5");
        } else {
            System.out.println("O número não é múltiplo de 5");
        }
        sc.close();
    }
}