package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qntd = sc.nextInt();

        double item = switch (cod) {
            case 1 -> 4.00;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            case 5 -> 1.50;
            default -> 0.00;
        };
        
        double total = qntd * item;
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
