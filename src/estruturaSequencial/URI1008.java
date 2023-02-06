package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod, horas;
        double salario;

        cod = sc.nextInt();
        horas = sc.nextInt();
        salario = sc.nextDouble();

        salario = horas * salario;
        System.out.println("NUMBER = " + cod);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
