package JavaStart.HomeWork007;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Conversion {
    static double conversion(double cash, double currencySales, double currencyBought) {
        double conversion = (cash * currencySales) / currencyBought;    // Основиний розрахунок між валютами

        return conversion;
    }

    public static void main(String[] args) {
        System.out.println("*( USD EUR GBP PLZ JPY CZK DKK ILS GEL HGD )* \n");

        HashMap<String, Double> myHashMap = new HashMap<>();
        myHashMap.put("USD", 36.5686);
        myHashMap.put("EUR", 40.4942);
        myHashMap.put("GBP", 46.0198);
        myHashMap.put("PLZ", 8.8253);
        myHashMap.put("JPY", 0.2721);
        myHashMap.put("CZK", 1.7265);
        myHashMap.put("DKK", 5.4356);
        myHashMap.put("ILS", 10.0535);
        myHashMap.put("GEL", 14.6673);
        myHashMap.put("HKD", 4.6594);

        for (Map.Entry<String, Double> entry : myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        Scanner scannerData = new Scanner(System.in);
        System.out.println("Введіть суму для конвертації: ");
        double cash = scannerData.nextDouble();
        System.out.println("Введіть курс бажаної валюти з якої конвертуєте: ");
        double currencySales = scannerData.nextDouble();
        System.out.println("Введіть курс бажаної валюти на яку конвертуєте: ");
        double currencyBought = scannerData.nextDouble();
        System.out.println("Сума " + cash + " при конверртації валюти з " + currencySales + " по курсу НБУ на курс валюти " + currencyBought + " складає " + conversion(cash, currencySales, currencyBought));
    }
}

//Завдання 3
//
//        Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти. Користувач вводить:
//        1)      суму грошей у певній валюті;
//        2)      курс конвертації в іншу валюту.
//        Організуйте виведення результату операції конвертування валюти на екран.