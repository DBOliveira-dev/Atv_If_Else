package Ativs_If_Else;

import java.util.Scanner;

public class Atv_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double Num1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double Num2 = sc.nextDouble();

        double media = (Num1 + Num2) / 2;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado com média: " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("O aluno está em recuperação com média: " + media);
        } else {
            System.out.println("O aluno foi reprovado com média: " + media);
        }

        sc.close();
    }
}
