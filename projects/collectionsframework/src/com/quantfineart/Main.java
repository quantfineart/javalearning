package com.quantfineart;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//	 write your code here
//	 System.out.print("Starting Theatre Application");
//        for (int i = 1; i <=15 ; i++) {
//            Thread.sleep(100);
//            System.out.print(".");
//        }
//        System.out.println();
//        System.out.println("Application Started. ");

        Theatre theatre = new Theatre("Event Cinema - Castle Hill", 8, 12);
//        theatre.getSeats();

        if (theatre.reserveSeat("H11") ){
            System.out.println("Please Pay now.");
            }
        else{
            System.out.println("Sorry seat is taken!");
        }

        if (theatre.reserveSeat("H11") ){
            System.out.println("Please Pay now.");
        }
        else{
            System.out.println("Sorry seat is taken!");
        }

    }
}
