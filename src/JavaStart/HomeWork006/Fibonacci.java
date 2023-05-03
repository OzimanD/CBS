package JavaStart.HomeWork006;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внесіть ціле число для виводу ряду Фібоначі");
        long input = sc.nextLong();
        int n0 = 0;
        int n1 = 1;
        int tmp;
        for (int i = 2; i < input; i++) {
            tmp = n0 + n1;
            n0 = n1;
            n1 = tmp;
            System.out.print(tmp + " | ");
        }
    }
}

//Завдання 9
//        Знайдіть послідовність Фібоначчі. Одне стартове число користувач вводить, друге вводить користувач до шуканого.