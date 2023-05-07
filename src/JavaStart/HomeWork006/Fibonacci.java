package JavaStart.HomeWork006;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внесіть ціле число для виводу ряду Фібоначі");
        int input = sc.nextInt();
        System.out.println("Внесіть ціле число при досяганні якого необхідно виконати завершення ряду");
        int endLineNumber = sc.nextInt();
        int n0 = input;   // Старт відліку
        int n1 = 1;
        int tmp;
        for (int i = n0; i < endLineNumber; i++) {
            if (input < endLineNumber) {
                tmp = n0 + n1;
                n0 = n1;
                n1 = tmp;
                System.out.print(tmp + " | ");

            } else if (input > endLineNumber) {
                System.out.println("Введене число відліку: " + input + " є більшим за кінцеве число заверешення: " + endLineNumber);
                break;
            }
        }
    }
}

//Завдання 9
//        Знайдіть послідовність Фібоначчі.
//        Одне стартове число користувач вводить,
//        друге вводить користувач до шуканого.


