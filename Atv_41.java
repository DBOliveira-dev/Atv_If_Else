package JavaTarde;

import java.util.Scanner;

public class Atv_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Ambos os números são positivos.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Ambos os números são negativos.");
        } else {
            System.out.println("Os números têm sinais diferentes.");
            sc.close();

        }
    }
}
