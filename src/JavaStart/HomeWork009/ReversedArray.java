package JavaStart.HomeWork009;

import java.util.Scanner;

public class ReversedArray {


    static void myReverse(int [] array){

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }



    static int [] subArray (int [] array, int index, int count){
        if (count < array.length){
            for (int i = index; i < array[count]; i++) {
                System.out.println(array[i] + " ");
            }
        }if (count > array.length){
            System.out.println("вихід за масив");
        }

        return array;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Введіть число яке бажаєте додати до масиву " + i + " /з " + array.length);
            array[i] = sc.nextInt();
        }

//        for (int outArray :array) {
//            System.out.print(outArray + " ");
//        }
//
//        myReverse(array);

        subArray(array,4,10);

    }
}
