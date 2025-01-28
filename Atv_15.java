package org.JavaTarde;

import java.util.Scanner;

public class Atv_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da primeira disciplina: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota da segunda disciplina: ");
        double nota2 = sc.nextDouble();

        if (nota1 >= 6 && nota2 >= 6) {
            System.out.println("O aluno foi aprovado nas duas disciplinas!");
        } else if (nota1 >= 6) {
            System.out.println("O aluno foi aprovado na primeira disciplina, mas reprovado na segunda.");
        } else if (nota2 >= 6) {
            System.out.println("O aluno foi aprovado na segunda disciplina, mas reprovado na primeira.");
        } else {
            System.out.println("O aluno foi reprovado nas duas disciplinas.");
        }

        sc.close();
    }
}
