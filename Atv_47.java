package JavaTarde;

import java.util.Scanner;

public class Atv_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoCorreto = 1234;
        System.out.print("Digite o código de acesso: ");
        int codigoUsuario = sc.nextInt();

        if (codigoUsuario == codigoCorreto) {
            System.out.println("Código de acesso correto.");
        } else {
            System.out.println("Código de acesso incorreto.");
            sc.close();
        }
    }
}



