// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int password;
        password = sc.nextInt();

        while(password != 2002) {
            System.out.printf("Senha Invalida \n");
            password = sc.nextInt();
        }

        System.out.printf("Acesso Permitido");

        sc.close();
    }
}
