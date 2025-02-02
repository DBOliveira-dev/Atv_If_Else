package JavaTarde;

import java.util.Scanner;

public class Atv_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        if (idade <= 12) {
            System.out.println("Categoria: Criança");
        } else if (idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idade <= 64) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Idoso");
        }
    }
}
