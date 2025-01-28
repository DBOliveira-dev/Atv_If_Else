package Ativs_If_Else;

import java.util.Scanner;

public class Atv_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano para verificar se é bissexto:");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Esse ano é bissexto.");
        } else {
            System.out.println("Esse ano não é bissexto.");
        }

        sc.close();
    }
}
