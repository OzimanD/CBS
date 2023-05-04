package JavaStart.HomeWork006;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Error");
        }

        int factorial = 1;
        double tmp = 1;

        for (int i = 0; i < N; i++) {
            factorial = factorial + i;

            tmp = tmp + 1.0 / (factorial);

            System.out.println(tmp);

        }
    }
}
//Завдання 6
//        Дано ціле число N (> 0). Використовуючи один цикл, знайдіть суму 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)