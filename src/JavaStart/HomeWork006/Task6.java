package JavaStart.HomeWork006;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N > 0){
            int factorial = 1;
            int tmp = 0;

            for (int i = 0; i < N; i++) {
                factorial = factorial + i;

                tmp = tmp + 1/(factorial);

                System.out.println(tmp);
            }

        }else {
            System.out.println("Error");
        }

    }
}
//Завдання 6
//        Дано ціле число N (> 0). Використовуючи один цикл, знайдіть суму 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)