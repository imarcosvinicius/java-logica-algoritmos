package sequentialStructure;

import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade;
        double media;
        tempo = sc.nextInt();
        velocidade = sc.nextInt();
        media = (double) tempo * velocidade / 12.0;
        System.out.printf("%.3f", media);
    }
}
