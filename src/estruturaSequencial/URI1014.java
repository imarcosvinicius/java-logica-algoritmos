package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distacia = sc.nextInt();
        double litros = sc.nextDouble();
        double total = distacia / litros;
        System.out.printf("%.3f km/l%n", total);
    }
}
