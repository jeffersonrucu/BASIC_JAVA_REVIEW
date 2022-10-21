import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String keyup;
        keyup = sc.next();
        System.out.printf("String: %s \n", keyup);

        int intNumber;
        intNumber = sc.nextInt();
        System.out.printf("Int: %d \n", intNumber);

        double floatNumber;
        floatNumber = sc.nextDouble();
        System.out.printf("Double: %.2f \n", floatNumber);

        char charSex;
        charSex = sc.next().charAt(0);
        System.out.printf("Char: %s \n", charSex);


        sc.close();
    }
}