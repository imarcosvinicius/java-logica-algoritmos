package sequentialStructure;

import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, ano, mes, dia, resto;
        idade = sc.nextInt();

        ano = idade / 365;
        resto = idade % 365;
        mes = resto / 30;
        resto = resto % 30;
        dia = resto;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

    }
}
