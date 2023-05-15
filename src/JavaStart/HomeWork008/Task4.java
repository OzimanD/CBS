package JavaStart.HomeWork008;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {


    static void overloaded(double a, double b, double c) {
        double resultAvg = (a + b + c) / 3;
        System.out.println("Середнє арифмеичне значення складає: " + resultAvg);

        double[] arr = {a, b, c};
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println("******************************************************");
    }

    static void overloaded(double a, double b, double c, double d) {
        double resultAvg = (a + b + c + d) / 4;
        System.out.println("Середнє арифмеичне значення складає: " + resultAvg);

        double[] arr = {a, b, c, d};
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println("******************************************************");
    }

    static void overloaded(double a, double b, double c, double d, double e) {
        double resultAvg = (a + b + c + d + e) / 5;
        System.out.println("Середнє арифмеичне значення складає: " + resultAvg);

        double[] arr = {a, b, c, d, e};
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println("******************************************************");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("Заповнено " + i + "й елемент масиву.");
        }

        overloaded(array[0], array[1], array[2]);
        overloaded(array[0], array[1], array[2], array[3]);
        overloaded(array[0], array[1], array[2], array[3], array[4]);

    }
}

//Завдання 4
//        Створіть три перевантажені
//        методи для пошуку
//        середнього арифметичного числа з 3, 4, 5 змінних,
//        створіть метод для пошуку мінімального,максимального та середнього значень серед цих трьох методів.