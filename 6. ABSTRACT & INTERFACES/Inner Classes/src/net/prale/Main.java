package net.prale;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        /*Gearbox airwave = new Gearbox(6);

        airwave.operateClutch(true);
        airwave.changeGear(1);
        airwave.operateClutch(false);
        System.out.println(airwave.wheelSpeed(1000));
        airwave.changeGear(2);
        System.out.println(airwave.wheelSpeed(3000));
        airwave.operateClutch(true);
        airwave.changeGear(3);
        airwave.operateClutch(false);
        System.out.println(airwave.wheelSpeed(6000));*/

//        A LOCAL Class
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
//         listen();


        //Anonymous class implemented win the clickest onCLickListener
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
