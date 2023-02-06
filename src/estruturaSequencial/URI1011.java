package estruturaSequencial;

import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int raio = sc.nextInt();
        double pi = 3.14159;
        double total = (4/3.0) * pi * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f%n", total);
    }
}
