package JavaStart.HomeWork009;

import java.util.Scanner;

public class UserArray {

    static int[] methoodWithTwoParam(int[] array, int value) {
        int[] newArray = new int[value];

        for (int i = 0; i < array.length && i < newArray.length; i++) {
                newArray[i] = array[i];
        }
        System.out.println("Довжина нового масиву складає " + newArray.length);
        for (int soutNewArray : newArray) {
            System.out.print(soutNewArray + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ініціалізуйте роз'ємність масиву:");
        int arraySize = sc.nextInt();
        int[] mainArray = new int[arraySize];
        System.out.println("Довжина масиву: " + mainArray.length);

        for (int i = 0; i < mainArray.length; i++) {
            System.out.println("Введіть число яке бажаєте додати до масиву " + i + " /з " + mainArray.length);
            mainArray[i] = sc.nextInt();
        }

        for (int i = 0; i < mainArray.length; i++) {
            System.out.print(mainArray[i] + " ");
        }

        System.out.println();
        System.out.println("Внесфть ємність нового масиву: ");
        int capacityArray = sc.nextInt();

        mainArray = methoodWithTwoParam(mainArray, capacityArray);
    }
}

//Завдання 4
//        Використовуючи IntelliJ IDEA, створіть клас UserArray.
//        Створити метод, який виконуватиме збільшення довжини масиву,
//        переданого як аргумент, на 1 елемент.
//        Елементи масиву мають зберегти своє значення та порядок індексів.

//        Створити метод, який приймає два аргументи,
//        перший аргумент типу int [] array,
//        другий аргумент типу int value.
//        У тілі методу реалізуйте можливість додавання другого аргументу
//        методу в масив за індексом 0, водночас довжина нового масиву
//        має збільшитися на 1 елемент, а елементи одержуваного масиву як
//        перший аргумент мають скопіюватися в новий масив починаючи з індексу 1.