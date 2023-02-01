package sequentialStructure;

import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, horas, resto, minutos, segundos;
        n = sc.nextInt();

        horas = n / 3600;
        resto = n % 3600;
        minutos =  resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" +  minutos + ":" + segundos);
    }
}
