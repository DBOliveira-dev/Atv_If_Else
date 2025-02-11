package JavaTarde;

import java.util.Scanner;

public class Atv_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 3500.0;
        if (salario >= 3000) {
            System.out.println("Pode financiar o imóvel.");
        } else {
            System.out.println("Não pode financiar o imóvel.");
        }
        sc.close();


    }

}
