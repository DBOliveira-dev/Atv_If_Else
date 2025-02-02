package JavaTarde;

import java.util.Scanner;

public class Atv_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();

        if (altura < 1.60) {
            System.out.println("Você é considerada baixa.");
        } else if (altura >= 1.60 && altura <= 1.75) {
            System.out.println("Você tem altura média.");
        } else {
            System.out.println("Você é considerada alta.");
        }

        sc.close();

    }
}
