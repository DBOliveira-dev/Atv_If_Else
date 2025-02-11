package JavaTarde;

import java.util.Scanner;

public class Atv_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra = 980.0;
        double desconto = 0.10;
        if (valorCompra > 500) {
            double valorDesconto = valorCompra * desconto;
            double valorFinal = valorCompra - valorDesconto;
            System.out.println("Desconto: R$" + valorDesconto);
            System.out.println("Valor final: R$" + valorFinal);
        } else {
            System.out.println("Sem desconto.");
            sc.close();
        }
    }
}



