package JavaTarde;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atv_40 {
        public static void verificarData(String dataStr, String inicioStr, String fimStr) throws ParseException {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dataStr);
            Date inicio = formato.parse(inicioStr);
            Date fim = formato.parse(fimStr);

            if (!data.before(inicio) && !data.after(fim)) {
                System.out.println("Data está dentro do período");
            } else {
                System.out.println("Data está fora do período");
            }
        }

        public static void main(String[] args) throws ParseException {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a data (dd/MM/yyyy): ");
            String data = sc.nextLine();

            System.out.print("Digite a data de início (dd/MM/yyyy): ");
            String inicio = sc.nextLine();

            System.out.print("Digite a data de fim (dd/MM/yyyy): ");
            String fim = sc.nextLine();

            verificarData(data, inicio, fim);
            sc.close();
        }
    }




