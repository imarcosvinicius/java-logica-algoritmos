package estruturaSequencial;

import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, m1, m2;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        m1 = (a + b + Math.abs(a - b)) / 2;

        m2 = (m1 + c + Math.abs(m1 - c)) / 2;

        System.out.println(m2 + " eh o maior");

        sc.close();
    }
}
