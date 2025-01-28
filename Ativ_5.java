package Ativs_If_Else;

import java.util.Scanner;

public class Ativ_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        System.out.println("Digite outro número: ");
        System.out.println("Digite um outro número: ");


        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();

        if (Num3 > Num1 && Num2 > Num1){
            System.out.println("O numero um é maior que o número dois");
        }else{
            System.out.println("O numero dois é maior que o número um");
        }
    }
}