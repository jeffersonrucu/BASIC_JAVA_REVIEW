//  Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//  mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valueOne,
            valueTwo,
            result;

        valueOne = sc.nextInt();
        valueTwo = sc.nextInt();
        result = valueOne + valueTwo;


        System.out.printf("%s + %s = %d", Integer.toString(valueOne), Integer.toString(valueTwo), result);

        sc.close();
    }
}
