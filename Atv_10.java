package Ativs_If_Else;

import java.util.Scanner;

public class Atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verifique se o número esta entre 100 e 200 ou fora do intervalo:");
        int num1 = sc.nextInt();
        if (num1 >= 100 && num1 <= 200) {
            System.out.println("Este número está entre 100 e 200.");
        } else {
            System.out.println("Este número não está entre 100 e 200.");
        }
        sc.close();
    }
}

