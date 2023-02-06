package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double base, altura, area, perimetro, diagonal;
        base = sc.nextDouble();
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2.0 * (base + altura);
        diagonal = Math.sqrt(base * base + altura * altura);
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);
    }
}
