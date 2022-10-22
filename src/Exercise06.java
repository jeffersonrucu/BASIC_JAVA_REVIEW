// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value;

        value = sc.nextDouble();

        if (value%2 == 0) {
            System.out.printf("Par");
        } else {
            System.out.printf("Impar");
        }

        sc.close();
    }
}
