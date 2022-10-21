// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double productA, productB, productC, productD, result;

        productA = sc.nextDouble();
        productB = sc.nextDouble();
        productC = sc.nextDouble();
        productD = sc.nextDouble();

        result = (productA * productB) - (productC * productD);

        System.out.printf("A diferença do produto A e B pelo produto de C e D é %.0f", result);

        sc.close();
    }
}
