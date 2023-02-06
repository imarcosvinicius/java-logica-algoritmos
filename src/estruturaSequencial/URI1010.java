package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, n1, cod2, n2;
        double val1, val2, total;

        cod1 = sc.nextInt();
        n1 = sc.nextInt();
        val1 = sc.nextDouble();

        cod2 = sc.nextInt();
        n2 = sc.nextInt();
        val2 = sc.nextDouble();

        total = (n1 * val1) + (n2 * val2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
