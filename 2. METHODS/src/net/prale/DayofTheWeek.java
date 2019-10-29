package net.prale;

public class DayofTheWeek {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(4);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(3);
        printDayOfTheWeek(2);
        printDayOfTheWeek(6);

    }

    public static void printDayOfTheWeek(int day){

        //If statement implementation
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }

        //switch statement implementation
        /*switch (day){
            case 0:
                System.out.println("Its a Sunday");
                break;
            case 1:
                System.out.println("Its a Monday");
                break;
            case 2:
                System.out.println("Its a Tuesday");
                break;
            case 3:
                System.out.println("Its a Wednesday");
                break;
            case 4:
                System.out.println("Its a Thursday");
                break;
            case 5:
                System.out.println("Its a Friday");
                break;
            case 6:
                System.out.println("Its a Saturday");
                break;
                default:
                    System.out.println("invalid day");
                    break;
        }*/
    }
}
