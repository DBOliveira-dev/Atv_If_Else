package JavaTarde;

import java.util.Scanner;

public class Atv_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor da compra: ");
            double valorCompra = sc.nextDouble();

            if (valorCompra >= 200) {
                System.out.println("Parabéns! Você ganhou um brinde.");
            } else {
                System.out.println("Valor da compra abaixo do mínimo para ganhar brinde.");
                sc.close();
            }
        }
    }

