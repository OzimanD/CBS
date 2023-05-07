package JavaStart.HomeWork007;

import java.util.Scanner;

public class NumbersCheck {

    static void inputNumberHigherThenZero(double inputNumber) {
        if (inputNumber > 0) {
            System.out.println("Введене число є додатнім і має значення що > 0");
        } else if (inputNumber < 0) {
            System.err.println("Введене число є від'ємним і має значення що < 0");
        } else if (inputNumber == 0) {
            System.out.println("Введене число є рівним 0");
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputNumber = sc.nextDouble();

        inputNumberHigherThenZero(inputNumber);


    }


}


//Завдання 4
//        Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
//        1)      чи є введене число позитивним, чи негативним;
//        2)      чи є воно простим (використовуйте техніку перебору значень).
//        Просте число – це натуральне число, яке ділиться на 1 й саме на себе.
//        Щоби визначити просте число чи ні, варто знайти всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
//        3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.