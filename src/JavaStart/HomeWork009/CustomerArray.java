package JavaStart.HomeWork009;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {

     int [] CustomerArray = new int[10];

     CustomerArray[0] =  43;
     CustomerArray[1] =  1;
     CustomerArray[2] =  92;
     CustomerArray[3] =  45;
     CustomerArray[4] =  19;
     CustomerArray[5] =  11;
     CustomerArray[6] =  89;
     CustomerArray[7] =  102;
     CustomerArray[8] =  3;
     CustomerArray[9] =  66;

        for (int soutArray: CustomerArray) {
            System.out.print(soutArray + ",");
        }

        System.out.println();

        System.out.println(Arrays.stream(CustomerArray).max());
        System.out.println(Arrays.stream(CustomerArray).min());


    }
}
