// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value;

        value = sc.nextDouble();

        if (value < 0) {
            System.out.printf("Negativo");
        } else {
            System.out.printf("Não negativo");
        }

        sc.close();
    }
}
