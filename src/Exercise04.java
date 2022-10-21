// Fazer um programa que leia o nome de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double hours, hourValue, salary;

        name = sc.nextLine();
        hours = sc.nextDouble();
        hourValue = sc.nextDouble();

        salary = hours * hourValue;

        System.out.printf("O salário de %s é U$ %.2f", name, salary);

        sc.close();
    }
}
