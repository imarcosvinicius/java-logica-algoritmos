package estruturaCondicional;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        if (num < 0.0 || num > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (num <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (num <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (num <= 75.0) {
            System.out.println("Intervalo (50,15]");
        } else if (num <= 100.0) {
            System.out.println("Intervalo (75,100]");
        }
    }
}
