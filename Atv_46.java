package JavaTarde;

import java.util.Scanner;

public class Atv_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a placa do veículo: ");
        String placa = sc.nextLine();
        int ultimoNumero = Character.getNumericValue(placa.charAt(placa.length() - 1));

        if (ultimoNumero % 2 == 0) {
            System.out.println("Veículo pode passar no pedágio (placa terminada em número par).");
        } else {
            System.out.println("Veículo NÃO pode passar no pedágio (placa terminada em número ímpar).");
            sc.close();
        }
    }
}




