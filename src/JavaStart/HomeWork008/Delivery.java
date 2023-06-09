package JavaStart.HomeWork008;

import java.util.Scanner;

public class Delivery {


    static int deliveryMethod(int clients) {
        if (clients <= 1) {
            return 1;
        } else
            return clients * deliveryMethod(clients - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внесіть кількість клієнтів:");
        int clients = sc.nextInt();

        int factResult = deliveryMethod(clients);
        System.out.println("Існує: " + factResult + " імовірностей маршрутів доставки для " + clients + " клієнтів.");
    }
}

//Завдання 3
//        Є N клієнтів, яким компанія-виробник має доставити товар.
//        Скільки є можливих маршрутів доставлення товару з урахуванням того,
//        що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery.
//        Напишіть програму, яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
//        Для розв'язку задачі, використовуйте факторіал N!,
//        що розраховується рекурсією. Поясніть, чому не рекомендується використовувати
//        рекурсію для розрахунку факторіала. Вкажіть слабкі місця цього підходу.