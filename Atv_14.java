package org.JavaTarde;

import java.util.Scanner;

public class Atv_14 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Digite a nota do aluno: ");
                double nota = sc.nextDouble();

                if (nota >= 10) {
                    System.out.println("O aluno foi aprovado e obteve a nota máxima!");
                } else if (nota >= 6) {
                    System.out.println("O aluno foi aprovado.");
                } else {
                    System.out.println("O aluno foi reprovado.");
                }

                sc.close();
            }
        }


