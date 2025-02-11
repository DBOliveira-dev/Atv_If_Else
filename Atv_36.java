package JavaTarde;

import java.util.Scanner;

public class Atv_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora (0 a 23): ");
        int hora = sc.nextInt();
        System.out.print("Digite os minutos (0 a 59): ");
        int minutos = sc.nextInt();

        if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
            sc.close();

        }
    }
}
