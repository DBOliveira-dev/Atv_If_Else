package JavaTarde;

import java.util.Scanner;

public class Atv_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 4000.0;
        double valorParcela = 300.0;
        if (valorParcela <= salario * 0.10) {
            System.out.println("Pode comprar parcelado.");
        } else {
            System.out.println("Não pode comprar parcelado.");
            sc.close();

        }
    }
}
