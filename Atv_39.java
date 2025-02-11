package JavaTarde;

import java.util.Scanner;

public class Atv_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora (0 a 23): ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora < 12) {
            System.out.println("É manhã.");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("É tarde.");
        } else if (hora >= 18 && hora < 24) {
            System.out.println("É noite.");
        } else {
            System.out.println("Hora inválida.");
            sc.close();

        }
    }
}
