package Ativs_If_Else;

import java.util.Scanner;

public class Ativ_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int Idade = sc.nextInt();

        if (Idade >= 16){
            System.out.println("Você tem idade para votar!");
        }else{
            System.out.println("Você não tem idade para votar!");
        }
    }
}
