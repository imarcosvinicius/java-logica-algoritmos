package estruturaSequencial;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        DecimalFormat df = new java.text.DecimalFormat("###,####,##");
        Scanner sc = new Scanner(System.in);

        int n, cem, resto, cinquenta, vinte, dez, cinco, dois, um;
        n = sc.nextInt();

        cem = n / 100;
        resto = n % 100;
        cinquenta = resto / 50;
        resto = resto % 50;
        vinte = resto / 20;
        resto = resto % 20;
        dez = resto / 10;
        resto = resto % 10;
        cinco = resto / 5;
        resto = resto % 5;
        dois = resto / 2;
        resto = resto % 2;
        um = resto;
        System.out.println(n);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }
}
