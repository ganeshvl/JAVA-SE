package net.prale;

import java.util.*;

public class ReverseArray {

    /*function reverses the elements of the array*/
    static void reverse(int a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args) {

        int[] array = {3, 45, 67, 90};
        System.out.println("Array elements are: " + Arrays.toString(array));

        reverse(array);
    }
}

/*-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name 乪ReverseArrayChallenge乫*/
