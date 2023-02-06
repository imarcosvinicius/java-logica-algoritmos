package estruturaSequencial;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Informe o valor: ");
        x = sc.nextInt();

        System.out.println("\nVocê digitou: " + x);

        sc.close();
    }

}
