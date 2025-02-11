package JavaTarde;

import java.util.Scanner;

public class Atv_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia do mês: ");
        int mes = sc.nextInt();
        int dia = sc.nextInt();

        boolean diaValido = false;

        if (mes == 2 && dia >= 1 && dia <= 28) {
            diaValido = true;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
            diaValido = true;
        } else if (dia >= 1 && dia <= 31) {
            diaValido = true;
        }

        if (diaValido) {
            System.out.println("Dia válido.");
        } else {
            System.out.println("Dia inválido.");
            sc.close();
        }
    }
}


