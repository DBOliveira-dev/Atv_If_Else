package Ativs_If_Else;

import java.util.Scanner;

public class Atv_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 10 a 50:");
        int num1 = sc.nextInt();

        if (num1 >= 10 && num1 <= 50) {
            System.out.println("Este número está entre 10 e 50.");
        } else {
            System.out.println("Este número não está entre 10 e 50.");
        }
           sc.close();
    }
}



