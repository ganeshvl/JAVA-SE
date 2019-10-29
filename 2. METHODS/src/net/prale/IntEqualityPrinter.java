package net.prale;

public class IntEqualityPrinter {

    public static void printEqual (int x, int y, int z){

        if ( x <0 || y <0 || z <0){
            System.out.println("Invalid value");
        } else if (x == y && (y == z)) {
            System.out.println("All numbers are equal");
        } else if (x != y && (x != z) && (y != z)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1,2,1);
    }
}
