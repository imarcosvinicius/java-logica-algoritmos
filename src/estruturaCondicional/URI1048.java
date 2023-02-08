package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, aumento, percentual;
        salario = sc.nextDouble();

        if (salario <= 400.00) {
            percentual = 15.0 / 100.0;
            aumento = percentual * salario;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 15 %");
        } else if (salario <= 800.00) {
            percentual = 12.0 / 100.0;
            aumento = percentual * salario;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 12 %");
        } else if (salario <= 1200.00) {
            percentual = 10.0 / 100.0;
            aumento = percentual * salario;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 10 %");
        } else if (salario <= 2000.00) {
            percentual = 7.0 / 100.0;
            aumento = percentual * salario;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 7 %");
        } else {
            percentual = 4.0 / 100.0;
            aumento = percentual * salario;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 4 %");
        }
    }
}
