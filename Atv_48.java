package JavaTarde;

import java.util.Scanner;

public class Atv_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Para Fahrenheit");
        System.out.println("2 - Para Kelvin");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " °C é igual a " + fahrenheit + " °F.");
        } else if (escolha == 2) {
            double kelvin = celsius + 273.15;
            System.out.println(celsius + " °C é igual a " + kelvin + " K.");
        } else {
            System.out.println("Escolha inválida.");
            sc.close();
        }
    }
}




