package net.prale;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] element = readIntegers(4);

        int[] min = findMin(element);

        //Use the sorted array to find element at 0 position
        System.out.println("Minimum Element is: " + min[0]);
    }

    public static int[] readIntegers(int count){

        int[] array = new int[count];
        System.out.printf("Enter number: " + count + " integer value\r");
        for (int i =0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] findMin(int[] array){

        int[] minArray = Arrays.copyOf(array, array.length);

        Arrays.sort(minArray);

        return minArray;
    }

}


/*-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name 乪MinElementChallenge乫*/
