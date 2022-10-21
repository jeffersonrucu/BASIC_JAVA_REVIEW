// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, result;

        radius = sc.nextDouble();
        result = Math.pow(radius, 2) * 3.1415;

        System.out.printf("A área de um círculo com o raio de %s é %.4f" , Double.toString(radius) ,result);

        sc.close();
    }
}
