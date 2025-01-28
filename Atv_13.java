package org.JavaTarde;

import java.util.Scanner;

public class Atv_13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Solicita as três notas ao usuário
            System.out.println("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = sc.nextDouble();

            // Inicializa as variáveis para maior e menor nota
            double maior = nota1;
            double menor = nota1;


            if (nota2 > maior) {
                maior = nota2;
            }
            if (nota3 > maior) {
                maior = nota3;
            }

            if (nota2 < menor) {
                menor = nota2;
            }
            if (nota3 < menor) {
                menor = nota3;
            }

            System.out.println("A maior nota é: " + maior);
            System.out.println("A menor nota é: " + menor);
        }   
    }


