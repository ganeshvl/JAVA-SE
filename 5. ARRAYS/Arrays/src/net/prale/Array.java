package net.prale;

import java.util.Scanner;


public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value is " + myIntegers[i]);
        }
        System.out.printf("The average is: " + getAverage(myIntegers));

        /*int[] myIntArray = new int[25]; //{1,2,3,4,5,6,7,8,9,10}
        myIntArray[0] = 45;
        myIntArray[3] = 476;

        //Use myIntArray instead of number cause that can change but arrayLength is constant
        for(int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        for(int i=0; i<myIntArray.length; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }*/
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " Integer value.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i =0; i<array.length; i++){
            sum += array[i];
        }

        return (double) sum/ (double) array.length;
    }
}
