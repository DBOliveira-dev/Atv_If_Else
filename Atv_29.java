package JavaTarde;

import java.util.Scanner;

public class Atv_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a pressão arterial (normal, moderado ou alto): ");
        String pressao = sc.nextLine().toLowerCase();

        if (pressao.equals("normal")) {
            System.out.println("Você está com risco baixo.");
        } else if (pressao.equals("moderado")) {
            System.out.println("Você está com risco moderado.");
        } else if (pressao.equals("alto")) {
            System.out.println("Você está com risco alto.");
        } else {
            System.out.println("Classificação inválida. Tente novamente.");
        }

        sc.close();

    }
}
